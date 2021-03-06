/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum LogMessageLevel {
  LML_TRIVIAL(OgreJNI.LML_TRIVIAL_get()),
  LML_NORMAL(OgreJNI.LML_NORMAL_get()),
  LML_WARNING(OgreJNI.LML_WARNING_get()),
  LML_CRITICAL(OgreJNI.LML_CRITICAL_get());

  public final int swigValue() {
    return swigValue;
  }

  public static LogMessageLevel swigToEnum(int swigValue) {
    LogMessageLevel[] swigValues = LogMessageLevel.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (LogMessageLevel swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + LogMessageLevel.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private LogMessageLevel() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private LogMessageLevel(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private LogMessageLevel(LogMessageLevel swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

