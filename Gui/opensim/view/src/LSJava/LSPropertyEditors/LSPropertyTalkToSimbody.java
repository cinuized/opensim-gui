//-----------------------------------------------------------------------------
// File:     LSPropertyTalkToSimbody.java
// Class:    LSPropertyTalkToSimbody
// Parents:  None
// Purpose:  Helpful class that easily communicates changes made in Java classes
//           (e.g., components such as text fields, sliders, and buttons)
//           to the Model (in Model/View/Controller) that is stored in the
//           OpenSim API which is written in C++.  In other words, simplifies 
//           communication Java to fields in OpenSimObjectModel.
// Authors:  Paul Mitiguy, 2011-2012.   
//--------------------------------------------------------------------------
// This work is dedicated to the public domain.
// To the maximum extent possible under law, the author(s) and contributor(s) have
// dedicated all copyright and related and neighboring rights to this software
// to the public domain worldwide. This software is distributed without warranty.
//--------------------------------------------------------------------------
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR   
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,     
// FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE 
// AUTHORS OR CONTRIBUTORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR 
// IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//--------------------------------------------------------------------------
package LSJava.LSPropertyEditors;
import  LSJava.LSUtility.*;
import  java.io.IOException;

import  org.opensim.modeling.Model;
import  org.opensim.modeling.OpenSimObject;
import  org.opensim.modeling.PropertySet;
import  org.opensim.modeling.Property;
import  org.opensim.modeling.ArrayDouble;
import  org.opensim.modeling.OpenSimContext;  
import  org.opensim.view.nodes.OpenSimNode;
import  org.opensim.view.nodes.OpenSimObjectNode;
import  org.opensim.view.pub.OpenSimDB;
import  org.opensim.view.ExplorerTopComponent;
import  org.openide.nodes.Node;


//-----------------------------------------------------------------------------
public class LSPropertyTalkToSimbody  
{ 
   //-----------------------------------------------------------------------------
   public  LSPropertyTalkToSimbody( OpenSimObject openSimObjectToConstructorShouldNotBeNull, OpenSimObjectNode openSimObjectNodeToConstructorMayBeNull )
   { 
      // Connect this object to its corresponding OpenSim object.
      // Note: Some of the connection occurs in other constructors.
      myOpenSimObjectPassedToConstructor = openSimObjectToConstructorShouldNotBeNull;
      myOpenSimObjectNodeMayBeNull = openSimObjectNodeToConstructorMayBeNull;
      if( myOpenSimObjectNodeMayBeNull == null ) 
         myOpenSimObjectNodeMayBeNull = LSPropertyTalkToSimbody.GetRootNodeAsOpenSimObjectNodeOrReturnNullIfNoMatch( myOpenSimObjectPassedToConstructor ); 
   } 


   //-----------------------------------------------------------------------------
   public OpenSimObject      GetOpenSimObject()             { return myOpenSimObjectPassedToConstructor; }  
   public String             GetOpenSimObjectName( )        { return this.GetOpenSimObject().getName(); } 
   
   //-----------------------------------------------------------------------------
   // Relevant class hierarchy:            OpenSimObjectNode -> OpenSimNode -> AbstractNode -> Node
   // Some children of OpenSimObjectNode:  OneBodyNode, OneJointNode
   //-----------------------------------------------------------------------------
   public OpenSimObjectNode  GetOpenSimObjectNodeOrNull()   { return myOpenSimObjectNodeMayBeNull; }  


   //-----------------------------------------------------------------------------
   public int  GetTextFieldWidthForOpenSimObjectName( )  
   { 
      String objectName = this.GetOpenSimObjectName();
      int  lengthOfObjectName = LSString.GetStringLength( objectName );
      double textFieldWidthForObjectName = 1.5 * ( lengthOfObjectName < 12 ? 12 : lengthOfObjectName );
      return (int)textFieldWidthForObjectName;
   }
   

   //----------------------------------------------------------------------------- 
   protected static OpenSimObjectNode  GetRootNodeAsOpenSimObjectNodeOrReturnNullIfNoMatch( Object objectToMatch )
   {
      ExplorerTopComponent explorerTopComponentTree = ExplorerTopComponent.findInstance();
      Node rootNode = explorerTopComponentTree == null ? null : explorerTopComponentTree.getExplorerManager().getRootContext();
      if( rootNode instanceof OpenSimNode  &&  objectToMatch != null )
      {
          OpenSimNode rootNodeAsOpenSimNode = (OpenSimNode)rootNode;
          OpenSimObjectNode matchingObjectNode = rootNodeAsOpenSimNode.findChild( objectToMatch );
	  return matchingObjectNode;
      }
      return null;
   }
  

   //-------------------------------------------------------------------------
   public Property  GetOpenSimObjectPropertyValueFromPropertyName( String propertyName ) 
   {
      PropertySet propertySet = this.GetOpenSimObject().getPropertySet();
      if( propertySet != null )
      {
         try{ return propertySet.get( propertyName );
         } catch( IOException ex ) { ex.printStackTrace(); }
      }
      return null;
   }
   
   //-------------------------------------------------------------------------
   public double  GetOpenSimObjectPropertyValueAsDoubleFromPropertyName( String propertyName ) 
   {
      Property openSimObjectProperty = this.GetOpenSimObjectPropertyValueFromPropertyName( propertyName );
      return openSimObjectProperty==null ? 0.0 : openSimObjectProperty.getValueDbl();
   }
   
   //-------------------------------------------------------------------------
   private ArrayDouble  GetOpenSimObjectPropertyValueAsArrayDoubleFromPropertyName( String propertyName ) 
   {
      Property openSimObjectProperty = this.GetOpenSimObjectPropertyValueFromPropertyName( propertyName );
      return openSimObjectProperty==null ? null : null; // openSimObjectProperty.getValueDblArray();
      // TODO: There is some type mis-match between Java/C++ double arrays that crashes the GUI completely and without warning.
   }

   //-------------------------------------------------------------------------
   public double[]  GetOpenSimObjectPropertyValueAsArrayDoubleNFromPropertyName( String propertyName, int expectedNumberOfElements ) 
   {
      ArrayDouble arrayDouble = this.GetOpenSimObjectPropertyValueAsArrayDoubleFromPropertyName( propertyName ); 
      boolean isValid = (arrayDouble!=null && arrayDouble.getSize() == expectedNumberOfElements);
      double retValue[] = new double[ expectedNumberOfElements ];
      for( int i=0;  i<expectedNumberOfElements; i++ ) retValue[i] = isValid ? arrayDouble.getitem(i) : 0.0;
      return retValue;
   }
      
   //-------------------------------------------------------------------------
   public double[]  GetOpenSimObjectPropertyValueAsArrayDouble3FromPropertyName( String propertyName )  { return this.GetOpenSimObjectPropertyValueAsArrayDoubleNFromPropertyName( propertyName, 3 ); }  
      
   //-------------------------------------------------------------------------
   private Model  GetModelAssociatedWithProperty(  )               { return ( myOpenSimObjectNodeMayBeNull != null ) ? myOpenSimObjectNodeMayBeNull.getModelForNode() : null; }
   private Model  GetModelAssociatedWithPropertyOrCurrentModel( )  { Model aModel = this.GetModelAssociatedWithProperty();  return (aModel != null ) ? aModel : OpenSimDB.getInstance().getCurrentModel(); }

   
   //-------------------------------------------------------------------------
   public void  SetOpenSimObjectPropertyValueAsDoubleForPropertyName( String propertyName, double valueToSet ) 
   {
      Property openSimObjectProperty = this.GetOpenSimObjectPropertyValueFromPropertyName( propertyName );
      if( openSimObjectProperty != null ) openSimObjectProperty.setValueDbl( valueToSet );
      this.RecreateOpenSimAPIModelAfterPropertyChange();
   }


   //-------------------------------------------------------------------------
   private void  RecreateOpenSimAPIModelAfterPropertyChange(  )  
   { 
      Model aModel = this.GetModelAssociatedWithPropertyOrCurrentModel(); 
      LSPropertyTalkToSimbody.RecreateOpenSimAPIModel( aModel ); 
   }
   
   //-------------------------------------------------------------------------
   private static void  RecreateOpenSimAPIModel( Model aModel )  
   { 
      OpenSimContext apiCommunicator = OpenSimDB.getInstance().getContext( aModel );
      apiCommunicator.recreateSystemAfterSystemExistsKeepStage();
   }

   
   //-----------------------------------------------------------------------------
   public boolean  SetOpenSimObjectName( String newName )    
   { 
      String oldName = this.GetOpenSimObjectName();
      if( newName != null && LSString.IsStringsEqualCaseSensitive(newName,oldName) == false )
      {
         this.GetOpenSimObject().setName( newName );
         
	 OpenSimObjectNode associatedOpenSimNodeOrNull = this.GetOpenSimObjectNodeOrNull(); // Can cast OpenSimObjectNode as OpenSimNode.
         if( associatedOpenSimNodeOrNull != null )
            associatedOpenSimNodeOrNull.renameObjectNode( this.GetOpenSimObject(), newName );
         
	 return true;
      }
      return false; // No name change.
   } 


   //-----------------------------------------------------------------------------
   // Class data
   private   OpenSimObject      myOpenSimObjectPassedToConstructor; 
   private   OpenSimObjectNode  myOpenSimObjectNodeMayBeNull;       // Relevant class hierarchy: OpenSimObjectNode -> OpenSimNode -> AbstractNode -> Node

}



