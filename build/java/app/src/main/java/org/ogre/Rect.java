/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Rect {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Rect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Rect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Rect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLeft(int value) {
    OgreJNI.Rect_left_set(swigCPtr, this, value);
  }

  public int getLeft() {
    return OgreJNI.Rect_left_get(swigCPtr, this);
  }

  public void setTop(int value) {
    OgreJNI.Rect_top_set(swigCPtr, this, value);
  }

  public int getTop() {
    return OgreJNI.Rect_top_get(swigCPtr, this);
  }

  public void setRight(int value) {
    OgreJNI.Rect_right_set(swigCPtr, this, value);
  }

  public int getRight() {
    return OgreJNI.Rect_right_get(swigCPtr, this);
  }

  public void setBottom(int value) {
    OgreJNI.Rect_bottom_set(swigCPtr, this, value);
  }

  public int getBottom() {
    return OgreJNI.Rect_bottom_get(swigCPtr, this);
  }

  public Rect() {
    this(OgreJNI.new_Rect__SWIG_0(), true);
  }

  public Rect(int l, int t, int r, int b) {
    this(OgreJNI.new_Rect__SWIG_1(l, t, r, b), true);
  }

  public Rect(Rect o) {
    this(OgreJNI.new_Rect__SWIG_2(Rect.getCPtr(o), o), true);
  }

  public int width() {
    return OgreJNI.Rect_width(swigCPtr, this);
  }

  public int height() {
    return OgreJNI.Rect_height(swigCPtr, this);
  }

  public boolean isNull() {
    return OgreJNI.Rect_isNull(swigCPtr, this);
  }

  public void setNull() {
    OgreJNI.Rect_setNull(swigCPtr, this);
  }

  public Rect merge(Rect rhs) {
    return new Rect(OgreJNI.Rect_merge(swigCPtr, this, Rect.getCPtr(rhs), rhs), false);
  }

  public Rect intersect(Rect rhs) {
    return new Rect(OgreJNI.Rect_intersect(swigCPtr, this, Rect.getCPtr(rhs), rhs), true);
  }

  public String toString() {
    return OgreJNI.Rect_toString(swigCPtr, this);
  }

}