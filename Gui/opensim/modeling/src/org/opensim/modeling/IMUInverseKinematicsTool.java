/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IMUInverseKinematicsTool extends OpenSimObject {
  private transient long swigCPtr;

  public IMUInverseKinematicsTool(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.IMUInverseKinematicsTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IMUInverseKinematicsTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_IMUInverseKinematicsTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IMUInverseKinematicsTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.IMUInverseKinematicsTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IMUInverseKinematicsTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.IMUInverseKinematicsTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.IMUInverseKinematicsTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IMUInverseKinematicsTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_model_file(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_model_file(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public String get_model_file(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_model_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_model_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_model_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_model_file(int i, String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_model_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_model_file(String value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_model_file(swigCPtr, this, value);
  }

  public void constructProperty_model_file(String initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_model_file(swigCPtr, this, initValue);
  }

  public String get_model_file() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_model_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_model_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_model_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_model_file(String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_model_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_marker_file(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_marker_file(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public String get_marker_file(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_marker_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_marker_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_marker_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_marker_file(int i, String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_marker_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_marker_file(String value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_marker_file(swigCPtr, this, value);
  }

  public void constructProperty_marker_file(String initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_marker_file(swigCPtr, this, initValue);
  }

  public String get_marker_file() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_marker_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_marker_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_marker_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_marker_file(String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_marker_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_orientations_file(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_orientations_file(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public String get_orientations_file(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_orientations_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_orientations_file(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_orientations_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientations_file(int i, String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_orientations_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_orientations_file(String value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_orientations_file(swigCPtr, this, value);
  }

  public void constructProperty_orientations_file(String initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_orientations_file(swigCPtr, this, initValue);
  }

  public String get_orientations_file() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_orientations_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_orientations_file() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_orientations_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientations_file(String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_orientations_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_sensor_to_opensim_rotations(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_sensor_to_opensim_rotations(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public Vec3 get_sensor_to_opensim_rotations(int i) {
    return new Vec3(opensimSimulationJNI.IMUInverseKinematicsTool_get_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_sensor_to_opensim_rotations(int i) {
    return new Vec3(opensimSimulationJNI.IMUInverseKinematicsTool_upd_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_sensor_to_opensim_rotations(int i, Vec3 value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_sensor_to_opensim_rotations__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_sensor_to_opensim_rotations(Vec3 value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_sensor_to_opensim_rotations(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_sensor_to_opensim_rotations(Vec3 initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_sensor_to_opensim_rotations(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_sensor_to_opensim_rotations() {
    return new Vec3(opensimSimulationJNI.IMUInverseKinematicsTool_get_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_sensor_to_opensim_rotations() {
    return new Vec3(opensimSimulationJNI.IMUInverseKinematicsTool_upd_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this), false);
  }

  public void set_sensor_to_opensim_rotations(Vec3 value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_sensor_to_opensim_rotations__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_time_range(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_time_range(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public double get_time_range(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_time_range(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_time_range(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.IMUInverseKinematicsTool_upd_time_range(swigCPtr, this, i), false);
  }

  public void set_time_range(int i, double value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_time_range(swigCPtr, this, i, value);
  }

  public int append_time_range(double value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_time_range(swigCPtr, this, value);
  }

  public void copyProperty_constraint_weight(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_constraint_weight(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public double get_constraint_weight(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_constraint_weight__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_constraint_weight(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.IMUInverseKinematicsTool_upd_constraint_weight__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_constraint_weight(int i, double value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_constraint_weight__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_constraint_weight(double value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_constraint_weight(swigCPtr, this, value);
  }

  public void constructProperty_constraint_weight(double initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_constraint_weight(swigCPtr, this, initValue);
  }

  public double get_constraint_weight() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_constraint_weight__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_constraint_weight() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.IMUInverseKinematicsTool_upd_constraint_weight__SWIG_1(swigCPtr, this), false);
  }

  public void set_constraint_weight(double value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_constraint_weight__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_accuracy(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_accuracy(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public double get_accuracy(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_accuracy__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_accuracy(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.IMUInverseKinematicsTool_upd_accuracy__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_accuracy(int i, double value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_accuracy__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_accuracy(double value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_accuracy(swigCPtr, this, value);
  }

  public void constructProperty_accuracy(double initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_accuracy(swigCPtr, this, initValue);
  }

  public double get_accuracy() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_accuracy__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_accuracy() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.IMUInverseKinematicsTool_upd_accuracy__SWIG_1(swigCPtr, this), false);
  }

  public void set_accuracy(double value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_accuracy__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_results_directory(IMUInverseKinematicsTool source) {
    opensimSimulationJNI.IMUInverseKinematicsTool_copyProperty_results_directory(swigCPtr, this, IMUInverseKinematicsTool.getCPtr(source), source);
  }

  public String get_results_directory(int i) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_results_directory__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_results_directory(int i) {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_results_directory__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_results_directory(int i, String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_results_directory__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_results_directory(String value) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_append_results_directory(swigCPtr, this, value);
  }

  public void constructProperty_results_directory(String initValue) {
    opensimSimulationJNI.IMUInverseKinematicsTool_constructProperty_results_directory(swigCPtr, this, initValue);
  }

  public String get_results_directory() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_get_results_directory__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_results_directory() {
    return new SWIGTYPE_p_std__string(opensimSimulationJNI.IMUInverseKinematicsTool_upd_results_directory__SWIG_1(swigCPtr, this), false);
  }

  public void set_results_directory(String value) {
    opensimSimulationJNI.IMUInverseKinematicsTool_set_results_directory__SWIG_1(swigCPtr, this, value);
  }

  public IMUInverseKinematicsTool() {
    this(opensimSimulationJNI.new_IMUInverseKinematicsTool__SWIG_0(), true);
  }

  public IMUInverseKinematicsTool(String setupFile) {
    this(opensimSimulationJNI.new_IMUInverseKinematicsTool__SWIG_1(setupFile), true);
  }

  public boolean run(boolean visualizeResults) {
    return opensimSimulationJNI.IMUInverseKinematicsTool_run__SWIG_0(swigCPtr, this, visualizeResults);
  }

  public boolean run() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_run__SWIG_1(swigCPtr, this);
  }

  public void setModel(Model aModel) {
    opensimSimulationJNI.IMUInverseKinematicsTool_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStartTime(double d) {
    opensimSimulationJNI.IMUInverseKinematicsTool_setStartTime(swigCPtr, this, d);
  }

  public double getStartTime() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_getStartTime(swigCPtr, this);
  }

  public void setEndTime(double d) {
    opensimSimulationJNI.IMUInverseKinematicsTool_setEndTime(swigCPtr, this, d);
  }

  public double getEndTime() {
    return opensimSimulationJNI.IMUInverseKinematicsTool_getEndTime(swigCPtr, this);
  }

  public static TimeSeriesTableVec3 loadMarkersFile(String markerFile) {
    return new TimeSeriesTableVec3(opensimSimulationJNI.IMUInverseKinematicsTool_loadMarkersFile(markerFile), true);
  }

  public void runInverseKinematicsWithOrientationsFromFile(Model model, String quaternionStoFileName, boolean visualizeResults) {
    opensimSimulationJNI.IMUInverseKinematicsTool_runInverseKinematicsWithOrientationsFromFile__SWIG_0(swigCPtr, this, Model.getCPtr(model), model, quaternionStoFileName, visualizeResults);
  }

  public void runInverseKinematicsWithOrientationsFromFile(Model model, String quaternionStoFileName) {
    opensimSimulationJNI.IMUInverseKinematicsTool_runInverseKinematicsWithOrientationsFromFile__SWIG_1(swigCPtr, this, Model.getCPtr(model), model, quaternionStoFileName);
  }

}