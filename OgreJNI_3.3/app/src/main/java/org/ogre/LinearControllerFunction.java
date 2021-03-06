/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class LinearControllerFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LinearControllerFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinearControllerFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_LinearControllerFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LinearControllerFunction(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values, float frequency, boolean deltaInput) {
    this(OgreJNI.new_LinearControllerFunction__SWIG_0(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values), frequency, deltaInput), true);
  }

  public LinearControllerFunction(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values, float frequency) {
    this(OgreJNI.new_LinearControllerFunction__SWIG_1(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values), frequency), true);
  }

  public LinearControllerFunction(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values) {
    this(OgreJNI.new_LinearControllerFunction__SWIG_2(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values)), true);
  }

  public static ControllerFunctionPtr create(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values, float frequency, boolean deltaInput) {
    return new ControllerFunctionPtr(OgreJNI.LinearControllerFunction_create__SWIG_0(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values), frequency, deltaInput), true);
  }

  public static ControllerFunctionPtr create(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values, float frequency) {
    return new ControllerFunctionPtr(OgreJNI.LinearControllerFunction_create__SWIG_1(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values), frequency), true);
  }

  public static ControllerFunctionPtr create(SWIGTYPE_p_std__vectorT_float_t keys, SWIGTYPE_p_std__vectorT_float_t values) {
    return new ControllerFunctionPtr(OgreJNI.LinearControllerFunction_create__SWIG_2(SWIGTYPE_p_std__vectorT_float_t.getCPtr(keys), SWIGTYPE_p_std__vectorT_float_t.getCPtr(values)), true);
  }

  public float calculate(float source) {
    return OgreJNI.LinearControllerFunction_calculate(swigCPtr, this, source);
  }

}
