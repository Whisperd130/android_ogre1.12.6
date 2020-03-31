/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HardwareBuffer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HardwareBuffer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HardwareBuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HardwareBuffer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_void lock(long offset, long length, HardwareBuffer.LockOptions options) {
    long cPtr = OgreJNI.HardwareBuffer_lock__SWIG_0(swigCPtr, this, offset, length, options.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void lock(HardwareBuffer.LockOptions options) {
    long cPtr = OgreJNI.HardwareBuffer_lock__SWIG_1(swigCPtr, this, options.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void unlock() {
    OgreJNI.HardwareBuffer_unlock(swigCPtr, this);
  }

  public void readData(long offset, long length, SWIGTYPE_p_void pDest) {
    OgreJNI.HardwareBuffer_readData(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pDest));
  }

  public void writeData(long offset, long length, SWIGTYPE_p_void pSource, boolean discardWholeBuffer) {
    OgreJNI.HardwareBuffer_writeData__SWIG_0(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pSource), discardWholeBuffer);
  }

  public void writeData(long offset, long length, SWIGTYPE_p_void pSource) {
    OgreJNI.HardwareBuffer_writeData__SWIG_1(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pSource));
  }

  public void copyData(HardwareBuffer srcBuffer, long srcOffset, long dstOffset, long length, boolean discardWholeBuffer) {
    OgreJNI.HardwareBuffer_copyData__SWIG_0(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer, srcOffset, dstOffset, length, discardWholeBuffer);
  }

  public void copyData(HardwareBuffer srcBuffer, long srcOffset, long dstOffset, long length) {
    OgreJNI.HardwareBuffer_copyData__SWIG_1(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer, srcOffset, dstOffset, length);
  }

  public void copyData(HardwareBuffer srcBuffer) {
    OgreJNI.HardwareBuffer_copyData__SWIG_2(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer);
  }

  public void _updateFromShadow() {
    OgreJNI.HardwareBuffer__updateFromShadow(swigCPtr, this);
  }

  public long getSizeInBytes() {
    return OgreJNI.HardwareBuffer_getSizeInBytes(swigCPtr, this);
  }

  public HardwareBuffer.Usage getUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.HardwareBuffer_getUsage(swigCPtr, this));
  }

  public boolean isSystemMemory() {
    return OgreJNI.HardwareBuffer_isSystemMemory(swigCPtr, this);
  }

  public boolean hasShadowBuffer() {
    return OgreJNI.HardwareBuffer_hasShadowBuffer(swigCPtr, this);
  }

  public boolean isLocked() {
    return OgreJNI.HardwareBuffer_isLocked(swigCPtr, this);
  }

  public void suppressHardwareUpdate(boolean suppress) {
    OgreJNI.HardwareBuffer_suppressHardwareUpdate(swigCPtr, this, suppress);
  }

  public enum Usage {
    HBU_STATIC(OgreJNI.HardwareBuffer_HBU_STATIC_get()),
    HBU_DYNAMIC(OgreJNI.HardwareBuffer_HBU_DYNAMIC_get()),
    HBU_WRITE_ONLY(OgreJNI.HardwareBuffer_HBU_WRITE_ONLY_get()),
    HBU_DISCARDABLE(OgreJNI.HardwareBuffer_HBU_DISCARDABLE_get()),
    HBU_STATIC_WRITE_ONLY(OgreJNI.HardwareBuffer_HBU_STATIC_WRITE_ONLY_get()),
    HBU_DYNAMIC_WRITE_ONLY(OgreJNI.HardwareBuffer_HBU_DYNAMIC_WRITE_ONLY_get()),
    HBU_DYNAMIC_WRITE_ONLY_DISCARDABLE(OgreJNI.HardwareBuffer_HBU_DYNAMIC_WRITE_ONLY_DISCARDABLE_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Usage swigToEnum(int swigValue) {
      Usage[] swigValues = Usage.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Usage swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Usage.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Usage() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Usage(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Usage(Usage swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum LockOptions {
    HBL_NORMAL,
    HBL_DISCARD,
    HBL_READ_ONLY,
    HBL_NO_OVERWRITE,
    HBL_WRITE_ONLY;

    public final int swigValue() {
      return swigValue;
    }

    public static LockOptions swigToEnum(int swigValue) {
      LockOptions[] swigValues = LockOptions.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (LockOptions swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + LockOptions.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private LockOptions() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private LockOptions(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private LockOptions(LockOptions swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}