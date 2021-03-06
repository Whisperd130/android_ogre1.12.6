/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class InstanceBatch extends Renderable {
  private transient long swigCPtr;

  protected InstanceBatch(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.InstanceBatch_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InstanceBatch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_InstanceBatch(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MeshPtr _getMeshRef() {
    return new MeshPtr(OgreJNI.InstanceBatch__getMeshRef(swigCPtr, this), false);
  }

  public void _setInstancesPerBatch(long instancesPerBatch) {
    OgreJNI.InstanceBatch__setInstancesPerBatch(swigCPtr, this, instancesPerBatch);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_short_t _getIndexToBoneMap() {
    long cPtr = OgreJNI.InstanceBatch__getIndexToBoneMap(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_unsigned_short_t(cPtr, false);
  }

  public boolean _supportsSkeletalAnimation() {
    return OgreJNI.InstanceBatch__supportsSkeletalAnimation(swigCPtr, this);
  }

  public void _updateBounds() {
    OgreJNI.InstanceBatch__updateBounds(swigCPtr, this);
  }

  public long calculateMaxNumInstances(SubMesh baseSubMesh, int flags) {
    return OgreJNI.InstanceBatch_calculateMaxNumInstances(swigCPtr, this, SubMesh.getCPtr(baseSubMesh), baseSubMesh, flags);
  }

  public RenderOperation build(SubMesh baseSubMesh) {
    return new RenderOperation(OgreJNI.InstanceBatch_build(swigCPtr, this, SubMesh.getCPtr(baseSubMesh), baseSubMesh), true);
  }

  public void buildFrom(SubMesh baseSubMesh, RenderOperation renderOperation) {
    OgreJNI.InstanceBatch_buildFrom(swigCPtr, this, SubMesh.getCPtr(baseSubMesh), baseSubMesh, RenderOperation.getCPtr(renderOperation), renderOperation);
  }

  public MeshPtr _getMeshReference() {
    return new MeshPtr(OgreJNI.InstanceBatch__getMeshReference(swigCPtr, this), false);
  }

  public boolean isBatchFull() {
    return OgreJNI.InstanceBatch_isBatchFull(swigCPtr, this);
  }

  public boolean isBatchUnused() {
    return OgreJNI.InstanceBatch_isBatchUnused(swigCPtr, this);
  }

  public void getInstancedEntitiesInUse(SWIGTYPE_p_std__vectorT_Ogre__InstancedEntity_p_t outEntities, SWIGTYPE_p_std__vectorT_Ogre__VectorT_4_Ogre__Real_t_t outParams) {
    OgreJNI.InstanceBatch_getInstancedEntitiesInUse(swigCPtr, this, SWIGTYPE_p_std__vectorT_Ogre__InstancedEntity_p_t.getCPtr(outEntities), SWIGTYPE_p_std__vectorT_Ogre__VectorT_4_Ogre__Real_t_t.getCPtr(outParams));
  }

  public void _defragmentBatch(boolean optimizeCulling, SWIGTYPE_p_std__vectorT_Ogre__InstancedEntity_p_t usedEntities, SWIGTYPE_p_std__vectorT_Ogre__VectorT_4_Ogre__Real_t_t usedParams) {
    OgreJNI.InstanceBatch__defragmentBatch(swigCPtr, this, optimizeCulling, SWIGTYPE_p_std__vectorT_Ogre__InstancedEntity_p_t.getCPtr(usedEntities), SWIGTYPE_p_std__vectorT_Ogre__VectorT_4_Ogre__Real_t_t.getCPtr(usedParams));
  }

  public void _defragmentBatchDiscard() {
    OgreJNI.InstanceBatch__defragmentBatchDiscard(swigCPtr, this);
  }

  public void _boundsDirty() {
    OgreJNI.InstanceBatch__boundsDirty(swigCPtr, this);
  }

  public void setStaticAndUpdate(boolean bStatic) {
    OgreJNI.InstanceBatch_setStaticAndUpdate(swigCPtr, this, bStatic);
  }

  public boolean isStatic() {
    return OgreJNI.InstanceBatch_isStatic(swigCPtr, this);
  }

  public InstancedEntity createInstancedEntity() {
    long cPtr = OgreJNI.InstanceBatch_createInstancedEntity(swigCPtr, this);
    return (cPtr == 0) ? null : new InstancedEntity(cPtr, false);
  }

  public void removeInstancedEntity(InstancedEntity instancedEntity) {
    OgreJNI.InstanceBatch_removeInstancedEntity(swigCPtr, this, InstancedEntity.getCPtr(instancedEntity), instancedEntity);
  }

  public boolean useBoneWorldMatrices() {
    return OgreJNI.InstanceBatch_useBoneWorldMatrices(swigCPtr, this);
  }

  public void _markTransformSharingDirty() {
    OgreJNI.InstanceBatch__markTransformSharingDirty(swigCPtr, this);
  }

  public void _setCustomParam(InstancedEntity instancedEntity, short idx, Vector4 newParam) {
    OgreJNI.InstanceBatch__setCustomParam(swigCPtr, this, InstancedEntity.getCPtr(instancedEntity), instancedEntity, idx, Vector4.getCPtr(newParam), newParam);
  }

  public Vector4 _getCustomParam(InstancedEntity instancedEntity, short idx) {
    return new Vector4(OgreJNI.InstanceBatch__getCustomParam(swigCPtr, this, InstancedEntity.getCPtr(instancedEntity), instancedEntity, idx), false);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreJNI.InstanceBatch_getMaterial(swigCPtr, this), false);
  }

  public void getRenderOperation(RenderOperation op) {
    OgreJNI.InstanceBatch_getRenderOperation(swigCPtr, this, RenderOperation.getCPtr(op), op);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreJNI.InstanceBatch_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
    return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.InstanceBatch_getLights(swigCPtr, this), false);
  }

  public Technique getTechnique() {
    long cPtr = OgreJNI.InstanceBatch_getTechnique(swigCPtr, this);
    return (cPtr == 0) ? null : new Technique(cPtr, false);
  }

  public String getMovableType() {
    return OgreJNI.InstanceBatch_getMovableType(swigCPtr, this);
  }

  public void _notifyCurrentCamera(Camera cam) {
    OgreJNI.InstanceBatch__notifyCurrentCamera(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public AxisAlignedBox getBoundingBox() {
    return new AxisAlignedBox(OgreJNI.InstanceBatch_getBoundingBox(swigCPtr, this), false);
  }

  public float getBoundingRadius() {
    return OgreJNI.InstanceBatch_getBoundingRadius(swigCPtr, this);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreJNI.InstanceBatch__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public void visitRenderables(Renderable.Visitor visitor, boolean debugRenderables) {
    OgreJNI.InstanceBatch_visitRenderables__SWIG_0(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor, debugRenderables);
  }

  public void visitRenderables(Renderable.Visitor visitor) {
    OgreJNI.InstanceBatch_visitRenderables__SWIG_1(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor);
  }

}
