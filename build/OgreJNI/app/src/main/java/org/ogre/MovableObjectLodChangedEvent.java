/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MovableObjectLodChangedEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MovableObjectLodChangedEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MovableObjectLodChangedEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MovableObjectLodChangedEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMovableObject(MovableObject value) {
    OgreJNI.MovableObjectLodChangedEvent_movableObject_set(swigCPtr, this, MovableObject.getCPtr(value), value);
  }

  public MovableObject getMovableObject() {
    long cPtr = OgreJNI.MovableObjectLodChangedEvent_movableObject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public void setCamera(Camera value) {
    OgreJNI.MovableObjectLodChangedEvent_camera_set(swigCPtr, this, Camera.getCPtr(value), value);
  }

  public Camera getCamera() {
    long cPtr = OgreJNI.MovableObjectLodChangedEvent_camera_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Camera(cPtr, false);
  }

  public MovableObjectLodChangedEvent() {
    this(OgreJNI.new_MovableObjectLodChangedEvent(), true);
  }

}