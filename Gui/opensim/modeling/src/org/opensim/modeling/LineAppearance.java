/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class LineAppearance extends BaseAppearance {
  private long swigCPtr;

  public LineAppearance(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.LineAppearance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(LineAppearance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_LineAppearance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static LineAppearance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.LineAppearance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new LineAppearance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.LineAppearance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.LineAppearance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.LineAppearance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new LineAppearance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.LineAppearance_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_thickness(LineAppearance source) {
    opensimModelJNI.LineAppearance_copyProperty_thickness(swigCPtr, this, LineAppearance.getCPtr(source), source);
  }

  public double get_thickness(int i) {
    return opensimModelJNI.LineAppearance_get_thickness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_thickness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.LineAppearance_upd_thickness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_thickness(int i, double value) {
    opensimModelJNI.LineAppearance_set_thickness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_thickness(double value) {
    return opensimModelJNI.LineAppearance_append_thickness(swigCPtr, this, value);
  }

  public void constructProperty_thickness(double initValue) {
    opensimModelJNI.LineAppearance_constructProperty_thickness(swigCPtr, this, initValue);
  }

  public double get_thickness() {
    return opensimModelJNI.LineAppearance_get_thickness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_thickness() {
    return new SWIGTYPE_p_double(opensimModelJNI.LineAppearance_upd_thickness__SWIG_1(swigCPtr, this), false);
  }

  public void set_thickness(double value) {
    opensimModelJNI.LineAppearance_set_thickness__SWIG_1(swigCPtr, this, value);
  }

  public LineAppearance() {
    this(opensimModelJNI.new_LineAppearance(), true);
  }

}