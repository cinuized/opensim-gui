/* -------------------------------------------------------------------------- *
 * OpenSim: OneWrapObjectNode.java                                            *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
package org.opensim.view.nodes;

import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;
import org.opensim.modeling.Body;
import org.opensim.modeling.WrapObject;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.WrapObjectSet;

/** Node class to wrap WrapObject objects */
public class OneWrapObjectNode extends OneComponentWithGeometryNode{
   private static ResourceBundle bundle = NbBundle.getBundle(OneBodyNode.class);
   public OneWrapObjectNode(OpenSimObject b) {
      super(b);
      setChildren(Children.LEAF);
      setShortDescription(bundle.getString("HINT_WrapObjectNode"));
      addDisplayOption(displayOption.Showable);
      addDisplayOption(displayOption.Isolatable);
      addDisplayOption(displayOption.Colorable);
      
   }

    public Node cloneNode() {
        return new OneWrapObjectNode(getOpenSimObject());
    }
    /**
     * Icon for the body node 
     **/
    public Image getIcon(int i) {
        URL imageURL = this.getClass().getResource("/org/opensim/view/nodes/icons/wrapNode.png");
        if (imageURL != null) {
            return new ImageIcon(imageURL, "Wrap Object").getImage();
        } else {
            return null;
        }
    }

}
