/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class AxisAlignedBox {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AxisAlignedBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AxisAlignedBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_AxisAlignedBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AxisAlignedBox() {
    this(OgreJNI.new_AxisAlignedBox__SWIG_0(), true);
  }

  public AxisAlignedBox(AxisAlignedBox.Extent e) {
    this(OgreJNI.new_AxisAlignedBox__SWIG_1(e.swigValue()), true);
  }

  public AxisAlignedBox(Vector3 min, Vector3 max) {
    this(OgreJNI.new_AxisAlignedBox__SWIG_2(Vector3.getCPtr(min), min, Vector3.getCPtr(max), max), true);
  }

  public AxisAlignedBox(float mx, float my, float mz, float Mx, float My, float Mz) {
    this(OgreJNI.new_AxisAlignedBox__SWIG_3(mx, my, mz, Mx, My, Mz), true);
  }

  public Vector3 getMinimum() {
    return new Vector3(OgreJNI.AxisAlignedBox_getMinimum__SWIG_0(swigCPtr, this), false);
  }

  public Vector3 getMaximum() {
    return new Vector3(OgreJNI.AxisAlignedBox_getMaximum__SWIG_0(swigCPtr, this), false);
  }

  public void setMinimum(Vector3 vec) {
    OgreJNI.AxisAlignedBox_setMinimum__SWIG_0(swigCPtr, this, Vector3.getCPtr(vec), vec);
  }

  public void setMinimum(float x, float y, float z) {
    OgreJNI.AxisAlignedBox_setMinimum__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void setMinimumX(float x) {
    OgreJNI.AxisAlignedBox_setMinimumX(swigCPtr, this, x);
  }

  public void setMinimumY(float y) {
    OgreJNI.AxisAlignedBox_setMinimumY(swigCPtr, this, y);
  }

  public void setMinimumZ(float z) {
    OgreJNI.AxisAlignedBox_setMinimumZ(swigCPtr, this, z);
  }

  public void setMaximum(Vector3 vec) {
    OgreJNI.AxisAlignedBox_setMaximum__SWIG_0(swigCPtr, this, Vector3.getCPtr(vec), vec);
  }

  public void setMaximum(float x, float y, float z) {
    OgreJNI.AxisAlignedBox_setMaximum__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void setMaximumX(float x) {
    OgreJNI.AxisAlignedBox_setMaximumX(swigCPtr, this, x);
  }

  public void setMaximumY(float y) {
    OgreJNI.AxisAlignedBox_setMaximumY(swigCPtr, this, y);
  }

  public void setMaximumZ(float z) {
    OgreJNI.AxisAlignedBox_setMaximumZ(swigCPtr, this, z);
  }

  public void setExtents(Vector3 min, Vector3 max) {
    OgreJNI.AxisAlignedBox_setExtents__SWIG_0(swigCPtr, this, Vector3.getCPtr(min), min, Vector3.getCPtr(max), max);
  }

  public void setExtents(float mx, float my, float mz, float Mx, float My, float Mz) {
    OgreJNI.AxisAlignedBox_setExtents__SWIG_1(swigCPtr, this, mx, my, mz, Mx, My, Mz);
  }

  public SWIGTYPE_p_std__arrayT_Ogre__VectorT_3_float_t_8_t getAllCorners() {
    return new SWIGTYPE_p_std__arrayT_Ogre__VectorT_3_float_t_8_t(OgreJNI.AxisAlignedBox_getAllCorners(swigCPtr, this), true);
  }

  public Vector3 getCorner(AxisAlignedBox.CornerEnum cornerToGet) {
    return new Vector3(OgreJNI.AxisAlignedBox_getCorner(swigCPtr, this, cornerToGet.swigValue()), true);
  }

  public void merge(AxisAlignedBox rhs) {
    OgreJNI.AxisAlignedBox_merge__SWIG_0(swigCPtr, this, AxisAlignedBox.getCPtr(rhs), rhs);
  }

  public void merge(Vector3 point) {
    OgreJNI.AxisAlignedBox_merge__SWIG_1(swigCPtr, this, Vector3.getCPtr(point), point);
  }

  public void transform(Matrix4 matrix) {
    OgreJNI.AxisAlignedBox_transform__SWIG_0(swigCPtr, this, Matrix4.getCPtr(matrix), matrix);
  }

  public void transform(Affine3 m) {
    OgreJNI.AxisAlignedBox_transform__SWIG_1(swigCPtr, this, Affine3.getCPtr(m), m);
  }

  public void setNull() {
    OgreJNI.AxisAlignedBox_setNull(swigCPtr, this);
  }

  public boolean isNull() {
    return OgreJNI.AxisAlignedBox_isNull(swigCPtr, this);
  }

  public boolean isFinite() {
    return OgreJNI.AxisAlignedBox_isFinite(swigCPtr, this);
  }

  public void setInfinite() {
    OgreJNI.AxisAlignedBox_setInfinite(swigCPtr, this);
  }

  public boolean isInfinite() {
    return OgreJNI.AxisAlignedBox_isInfinite(swigCPtr, this);
  }

  public boolean intersects(AxisAlignedBox b2) {
    return OgreJNI.AxisAlignedBox_intersects__SWIG_0(swigCPtr, this, AxisAlignedBox.getCPtr(b2), b2);
  }

  public AxisAlignedBox intersection(AxisAlignedBox b2) {
    return new AxisAlignedBox(OgreJNI.AxisAlignedBox_intersection(swigCPtr, this, AxisAlignedBox.getCPtr(b2), b2), true);
  }

  public float volume() {
    return OgreJNI.AxisAlignedBox_volume(swigCPtr, this);
  }

  public void scale(Vector3 s) {
    OgreJNI.AxisAlignedBox_scale(swigCPtr, this, Vector3.getCPtr(s), s);
  }

  public boolean intersects(Sphere s) {
    return OgreJNI.AxisAlignedBox_intersects__SWIG_1(swigCPtr, this, Sphere.getCPtr(s), s);
  }

  public boolean intersects(Plane p) {
    return OgreJNI.AxisAlignedBox_intersects__SWIG_2(swigCPtr, this, Plane.getCPtr(p), p);
  }

  public boolean intersects(Vector3 v) {
    return OgreJNI.AxisAlignedBox_intersects__SWIG_3(swigCPtr, this, Vector3.getCPtr(v), v);
  }

  public Vector3 getCenter() {
    return new Vector3(OgreJNI.AxisAlignedBox_getCenter(swigCPtr, this), true);
  }

  public Vector3 getSize() {
    return new Vector3(OgreJNI.AxisAlignedBox_getSize(swigCPtr, this), true);
  }

  public Vector3 getHalfSize() {
    return new Vector3(OgreJNI.AxisAlignedBox_getHalfSize(swigCPtr, this), true);
  }

  public boolean contains(Vector3 v) {
    return OgreJNI.AxisAlignedBox_contains__SWIG_0(swigCPtr, this, Vector3.getCPtr(v), v);
  }

  public float squaredDistance(Vector3 v) {
    return OgreJNI.AxisAlignedBox_squaredDistance(swigCPtr, this, Vector3.getCPtr(v), v);
  }

  public float distance(Vector3 v) {
    return OgreJNI.AxisAlignedBox_distance(swigCPtr, this, Vector3.getCPtr(v), v);
  }

  public boolean contains(AxisAlignedBox other) {
    return OgreJNI.AxisAlignedBox_contains__SWIG_1(swigCPtr, this, AxisAlignedBox.getCPtr(other), other);
  }

  public static AxisAlignedBox getBOX_NULL() {
    long cPtr = OgreJNI.AxisAlignedBox_BOX_NULL_get();
    return (cPtr == 0) ? null : new AxisAlignedBox(cPtr, false);
  }

  public static AxisAlignedBox getBOX_INFINITE() {
    long cPtr = OgreJNI.AxisAlignedBox_BOX_INFINITE_get();
    return (cPtr == 0) ? null : new AxisAlignedBox(cPtr, false);
  }

  public String toString() {
    return OgreJNI.AxisAlignedBox_toString(swigCPtr, this);
  }

  public enum Extent {
    EXTENT_NULL,
    EXTENT_FINITE,
    EXTENT_INFINITE;

    public final int swigValue() {
      return swigValue;
    }

    public static Extent swigToEnum(int swigValue) {
      Extent[] swigValues = Extent.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Extent swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Extent.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Extent() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Extent(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Extent(Extent swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum CornerEnum {
    FAR_LEFT_BOTTOM(OgreJNI.AxisAlignedBox_FAR_LEFT_BOTTOM_get()),
    FAR_LEFT_TOP(OgreJNI.AxisAlignedBox_FAR_LEFT_TOP_get()),
    FAR_RIGHT_TOP(OgreJNI.AxisAlignedBox_FAR_RIGHT_TOP_get()),
    FAR_RIGHT_BOTTOM(OgreJNI.AxisAlignedBox_FAR_RIGHT_BOTTOM_get()),
    NEAR_RIGHT_BOTTOM(OgreJNI.AxisAlignedBox_NEAR_RIGHT_BOTTOM_get()),
    NEAR_LEFT_BOTTOM(OgreJNI.AxisAlignedBox_NEAR_LEFT_BOTTOM_get()),
    NEAR_LEFT_TOP(OgreJNI.AxisAlignedBox_NEAR_LEFT_TOP_get()),
    NEAR_RIGHT_TOP(OgreJNI.AxisAlignedBox_NEAR_RIGHT_TOP_get());

    public final int swigValue() {
      return swigValue;
    }

    public static CornerEnum swigToEnum(int swigValue) {
      CornerEnum[] swigValues = CornerEnum.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (CornerEnum swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + CornerEnum.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private CornerEnum() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private CornerEnum(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private CornerEnum(CornerEnum swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
