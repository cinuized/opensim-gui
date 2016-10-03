/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public JointIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_JointIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(JointIterator other) {
    return opensimModelSimulationJNI.JointIterator_equals(swigCPtr, this, JointIterator.getCPtr(other), other);
  }

  public Joint __ref__() {
    return new Joint(opensimModelSimulationJNI.JointIterator___ref__(swigCPtr, this), false);
  }

  public Joint __deref__() {
    long cPtr = opensimModelSimulationJNI.JointIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public JointIterator next() {
    return new JointIterator(opensimModelSimulationJNI.JointIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.JointIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.JointIterator_getConcreteClassName(swigCPtr, this);
  }

  public Coordinate get_coordinates(int i) {
    return new Coordinate(opensimModelSimulationJNI.JointIterator_get_coordinates(swigCPtr, this, i), false);
  }

  public boolean get_reverse(int i) {
    return opensimModelSimulationJNI.JointIterator_get_reverse__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_reverse() {
    return opensimModelSimulationJNI.JointIterator_get_reverse__SWIG_1(swigCPtr, this);
  }

  public PhysicalFrame get_frames(int i) {
    return new PhysicalFrame(opensimModelSimulationJNI.JointIterator_get_frames(swigCPtr, this, i), false);
  }

  public int get_connector_parent_frame() {
    return opensimModelSimulationJNI.JointIterator__connector_parent_frame_get(swigCPtr, this);
  }

  public int get_connector_child_frame() {
    return opensimModelSimulationJNI.JointIterator__connector_child_frame_get(swigCPtr, this);
  }

  public boolean get_has_output_power() {
    return opensimModelSimulationJNI.JointIterator__has_output_power_get(swigCPtr, this);
  }

  public boolean get_has_output_reaction_on_parent() {
    return opensimModelSimulationJNI.JointIterator__has_output_reaction_on_parent_get(swigCPtr, this);
  }

  public boolean get_has_output_reaction_on_child() {
    return opensimModelSimulationJNI.JointIterator__has_output_reaction_on_child_get(swigCPtr, this);
  }

  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimModelSimulationJNI.JointIterator_getChildFrame(swigCPtr, this), false);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimModelSimulationJNI.JointIterator_getParentFrame(swigCPtr, this), false);
  }

  public Coordinate getCoordinate() {
    return new Coordinate(opensimModelSimulationJNI.JointIterator_getCoordinate(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelSimulationJNI.JointIterator_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelSimulationJNI.JointIterator_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelSimulationJNI.JointIterator_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State state, Vector mobilityForces) {
    return new SpatialVec(opensimModelSimulationJNI.JointIterator_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public SpatialVec calcReactionOnParentExpressedInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.JointIterator_calcReactionOnParentExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public SpatialVec calcReactionOnChildExpressedInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.JointIterator_calcReactionOnChildExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double calcPower(State s) {
    return opensimModelSimulationJNI.JointIterator_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public Model getModel() {
    return new Model(opensimModelSimulationJNI.JointIterator_getModel(swigCPtr, this), false);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelSimulationJNI.JointIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelSimulationJNI.JointIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.JointIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelSimulationJNI.JointIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelSimulationJNI.JointIterator_hasSystem(swigCPtr, this);
  }

  public String getAbsolutePathName() {
    return opensimModelSimulationJNI.JointIterator_getAbsolutePathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelSimulationJNI.JointIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimModelSimulationJNI.JointIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimModelSimulationJNI.JointIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimModelSimulationJNI.JointIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimModelSimulationJNI.JointIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelSimulationJNI.JointIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelSimulationJNI.JointIterator_getNumConnectors(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimModelSimulationJNI.JointIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(String name) {
    return new AbstractConnector(opensimModelSimulationJNI.JointIterator_getConnector__SWIG_0(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelSimulationJNI.JointIterator_getConnector__SWIG_2(swigCPtr, this, i), false);
  }

  public int getNumInputs() {
    return opensimModelSimulationJNI.JointIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelSimulationJNI.JointIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimModelSimulationJNI.JointIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelSimulationJNI.JointIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelSimulationJNI.JointIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelSimulationJNI.JointIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelSimulationJNI.JointIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelSimulationJNI.JointIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelSimulationJNI.JointIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.JointIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelSimulationJNI.JointIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelSimulationJNI.JointIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelSimulationJNI.JointIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.JointIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelSimulationJNI.JointIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelSimulationJNI.JointIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelSimulationJNI.JointIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelSimulationJNI.JointIterator_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelSimulationJNI.JointIterator_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelSimulationJNI.JointIterator_dumpConnections(swigCPtr, this);
  }

  public Component getParent() {
    return new Component(opensimModelSimulationJNI.JointIterator_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelSimulationJNI.JointIterator_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelSimulationJNI.JointIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelSimulationJNI.JointIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelSimulationJNI.JointIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelSimulationJNI.JointIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelSimulationJNI.JointIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelSimulationJNI.JointIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelSimulationJNI.JointIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelSimulationJNI.JointIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelSimulationJNI.JointIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelSimulationJNI.JointIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelSimulationJNI.JointIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelSimulationJNI.JointIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelSimulationJNI.JointIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelSimulationJNI.JointIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelSimulationJNI.JointIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelSimulationJNI.JointIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelSimulationJNI.JointIterator_toString(swigCPtr, this);
  }

}
