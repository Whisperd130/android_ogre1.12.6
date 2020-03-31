/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum PolygonMode {
  PM_POINTS(OgreJNI.PM_POINTS_get()),
  PM_WIREFRAME(OgreJNI.PM_WIREFRAME_get()),
  PM_SOLID(OgreJNI.PM_SOLID_get());

  public final int swigValue() {
    return swigValue;
  }

  public static PolygonMode swigToEnum(int swigValue) {
    PolygonMode[] swigValues = PolygonMode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (PolygonMode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + PolygonMode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private PolygonMode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private PolygonMode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private PolygonMode(PolygonMode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
