/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Station extends ModelComponent {
  private long swigCPtr;

  public Station(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Station_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Station obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Station(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Station safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Station_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Station(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Station_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Station_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Station_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Station(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Station_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location(Station source) {
    opensimModelJNI.Station_copyProperty_location(swigCPtr, this, Station.getCPtr(source), source);
  }

  public Vec3 get_location(int i) {
    return new Vec3(opensimModelJNI.Station_get_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location(int i) {
    return new Vec3(opensimModelJNI.Station_upd_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location(int i, Vec3 value) {
    opensimModelJNI.Station_set_location__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location(Vec3 value) {
    return opensimModelJNI.Station_append_location(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location(Vec3 initValue) {
    opensimModelJNI.Station_constructProperty_location(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location() {
    return new Vec3(opensimModelJNI.Station_get_location__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location() {
    return new Vec3(opensimModelJNI.Station_upd_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_location(Vec3 value) {
    opensimModelJNI.Station_set_location__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public Station() {
    this(opensimModelJNI.new_Station(), true);
  }

  public PhysicalFrame getReferenceFrame() {
    return new PhysicalFrame(opensimModelJNI.Station_getReferenceFrame(swigCPtr, this), false);
  }

  public void setReferenceFrame(PhysicalFrame aFrame) {
    opensimModelJNI.Station_setReferenceFrame(swigCPtr, this, PhysicalFrame.getCPtr(aFrame), aFrame);
  }

  public Vec3 findLocationInFrame(State s, Frame aFrame) {
    return new Vec3(opensimModelJNI.Station_findLocationInFrame(swigCPtr, this, State.getCPtr(s), s, Frame.getCPtr(aFrame), aFrame), true);
  }

}
