/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Passes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Passes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Passes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Passes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Passes() {
    this(OgreJNI.new_Passes__SWIG_0(), true);
  }

  public Passes(long n) {
    this(OgreJNI.new_Passes__SWIG_1(n), true);
  }

  public long size() {
    return OgreJNI.Passes_size(swigCPtr, this);
  }

  public long capacity() {
    return OgreJNI.Passes_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.Passes_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.Passes_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.Passes_clear(swigCPtr, this);
  }

  public void add(Pass x) {
    OgreJNI.Passes_add(swigCPtr, this, Pass.getCPtr(x), x);
  }

  public Pass get(int i) {
    long cPtr = OgreJNI.Passes_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public void set(int i, Pass val) {
    OgreJNI.Passes_set(swigCPtr, this, i, Pass.getCPtr(val), val);
  }

}