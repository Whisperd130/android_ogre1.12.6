/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SceneQuery {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SceneQuery(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SceneQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SceneQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class WorldFragment {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected WorldFragment(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(WorldFragment obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_SceneQuery_WorldFragment(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setFragmentType(SceneQuery.WorldFragmentType value) {
      OgreJNI.SceneQuery_WorldFragment_fragmentType_set(swigCPtr, this, value.swigValue());
    }
  
    public SceneQuery.WorldFragmentType getFragmentType() {
      return SceneQuery.WorldFragmentType.swigToEnum(OgreJNI.SceneQuery_WorldFragment_fragmentType_get(swigCPtr, this));
    }
  
    public void setSingleIntersection(Vector3 value) {
      OgreJNI.SceneQuery_WorldFragment_singleIntersection_set(swigCPtr, this, Vector3.getCPtr(value), value);
    }
  
    public Vector3 getSingleIntersection() {
      long cPtr = OgreJNI.SceneQuery_WorldFragment_singleIntersection_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Vector3(cPtr, false);
    }
  
    public void setPlanes(SWIGTYPE_p_std__vectorT_Ogre__Plane_t value) {
      OgreJNI.SceneQuery_WorldFragment_planes_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_Ogre__Plane_t.getCPtr(value));
    }
  
    public SWIGTYPE_p_std__vectorT_Ogre__Plane_t getPlanes() {
      long cPtr = OgreJNI.SceneQuery_WorldFragment_planes_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_Ogre__Plane_t(cPtr, false);
    }
  
    public void setGeometry(SWIGTYPE_p_void value) {
      OgreJNI.SceneQuery_WorldFragment_geometry_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
    }
  
    public SWIGTYPE_p_void getGeometry() {
      long cPtr = OgreJNI.SceneQuery_WorldFragment_geometry_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
    }
  
    public void setRenderOp(RenderOperation value) {
      OgreJNI.SceneQuery_WorldFragment_renderOp_set(swigCPtr, this, RenderOperation.getCPtr(value), value);
    }
  
    public RenderOperation getRenderOp() {
      long cPtr = OgreJNI.SceneQuery_WorldFragment_renderOp_get(swigCPtr, this);
      return (cPtr == 0) ? null : new RenderOperation(cPtr, false);
    }
  
    public WorldFragment() {
      this(OgreJNI.new_SceneQuery_WorldFragment(), true);
    }
  
  }

  public SceneQuery(SceneManager mgr) {
    this(OgreJNI.new_SceneQuery(SceneManager.getCPtr(mgr), mgr), true);
  }

  public void setQueryMask(long mask) {
    OgreJNI.SceneQuery_setQueryMask(swigCPtr, this, mask);
  }

  public long getQueryMask() {
    return OgreJNI.SceneQuery_getQueryMask(swigCPtr, this);
  }

  public void setQueryTypeMask(long mask) {
    OgreJNI.SceneQuery_setQueryTypeMask(swigCPtr, this, mask);
  }

  public long getQueryTypeMask() {
    return OgreJNI.SceneQuery_getQueryTypeMask(swigCPtr, this);
  }

  public void setWorldFragmentType(SceneQuery.WorldFragmentType wft) {
    OgreJNI.SceneQuery_setWorldFragmentType(swigCPtr, this, wft.swigValue());
  }

  public SceneQuery.WorldFragmentType getWorldFragmentType() {
    return SceneQuery.WorldFragmentType.swigToEnum(OgreJNI.SceneQuery_getWorldFragmentType(swigCPtr, this));
  }

  public SWIGTYPE_p_std__setT_Ogre__SceneQuery__WorldFragmentType_t getSupportedWorldFragmentTypes() {
    long cPtr = OgreJNI.SceneQuery_getSupportedWorldFragmentTypes(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__setT_Ogre__SceneQuery__WorldFragmentType_t(cPtr, false);
  }

  public enum WorldFragmentType {
    WFT_NONE,
    WFT_PLANE_BOUNDED_REGION,
    WFT_SINGLE_INTERSECTION,
    WFT_CUSTOM_GEOMETRY,
    WFT_RENDER_OPERATION;

    public final int swigValue() {
      return swigValue;
    }

    public static WorldFragmentType swigToEnum(int swigValue) {
      WorldFragmentType[] swigValues = WorldFragmentType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (WorldFragmentType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + WorldFragmentType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private WorldFragmentType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private WorldFragmentType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private WorldFragmentType(WorldFragmentType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}