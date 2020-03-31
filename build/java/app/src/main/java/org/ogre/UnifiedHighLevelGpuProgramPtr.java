/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class UnifiedHighLevelGpuProgramPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UnifiedHighLevelGpuProgramPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnifiedHighLevelGpuProgramPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_UnifiedHighLevelGpuProgramPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UnifiedHighLevelGpuProgramPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_UnifiedHighLevelGpuProgramPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public UnifiedHighLevelGpuProgramPtr() {
    this(OgreJNI.new_UnifiedHighLevelGpuProgramPtr__SWIG_1(), true);
  }

  public UnifiedHighLevelGpuProgramPtr(UnifiedHighLevelGpuProgramPtr r) {
    this(OgreJNI.new_UnifiedHighLevelGpuProgramPtr__SWIG_2(UnifiedHighLevelGpuProgramPtr.getCPtr(r), r), true);
  }

  public UnifiedHighLevelGpuProgram __deref__() {
    long cPtr = OgreJNI.UnifiedHighLevelGpuProgramPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new UnifiedHighLevelGpuProgram(cPtr, false);
  }

  public void setPriority(String shaderLanguage, int priority) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setPriority(swigCPtr, this, shaderLanguage, priority);
  }

  public int getPriority(String shaderLanguage) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getPriority(swigCPtr, this, shaderLanguage);
  }

  public long calculateSize() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_calculateSize(swigCPtr, this);
  }

  public void addDelegateProgram(String name) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_addDelegateProgram(swigCPtr, this, name);
  }

  public void clearDelegatePrograms() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_clearDelegatePrograms(swigCPtr, this);
  }

  public GpuProgramPtr _getDelegate() {
    return new GpuProgramPtr(OgreJNI.UnifiedHighLevelGpuProgramPtr__getDelegate(swigCPtr, this), false);
  }

  public String getLanguage() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getLanguage(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t createParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.UnifiedHighLevelGpuProgramPtr_createParameters(swigCPtr, this), true);
  }

  public GpuProgram _getBindingDelegate() {
    long cPtr = OgreJNI.UnifiedHighLevelGpuProgramPtr__getBindingDelegate(swigCPtr, this);
    return (cPtr == 0) ? null : new GpuProgram(cPtr, false);
  }

  public boolean isSupported() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isSupported(swigCPtr, this);
  }

  public boolean isSkeletalAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isSkeletalAnimationIncluded(swigCPtr, this);
  }

  public boolean isMorphAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isMorphAnimationIncluded(swigCPtr, this);
  }

  public boolean isPoseAnimationIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isPoseAnimationIncluded(swigCPtr, this);
  }

  public int getNumberOfPosesIncluded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getNumberOfPosesIncluded(swigCPtr, this);
  }

  public boolean isVertexTextureFetchRequired() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isVertexTextureFetchRequired(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t getDefaultParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.UnifiedHighLevelGpuProgramPtr_getDefaultParameters(swigCPtr, this), true);
  }

  public boolean hasDefaultParameters() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_hasDefaultParameters(swigCPtr, this);
  }

  public boolean getPassSurfaceAndLightStates() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getPassSurfaceAndLightStates(swigCPtr, this);
  }

  public boolean getPassFogStates() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getPassFogStates(swigCPtr, this);
  }

  public boolean getPassTransformStates() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getPassTransformStates(swigCPtr, this);
  }

  public boolean hasCompileError() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_hasCompileError(swigCPtr, this);
  }

  public void resetCompileError() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_resetCompileError(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isReloadable(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.UnifiedHighLevelGpuProgramPtr_getLoadingState(swigCPtr, this));
  }

  public void unload() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_touch(swigCPtr, this);
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public GpuNamedConstants getConstantDefinitions() {
    return new GpuNamedConstants(OgreJNI.UnifiedHighLevelGpuProgramPtr_getConstantDefinitions(swigCPtr, this), false);
  }

  public void setPreprocessorDefines(String defines) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setPreprocessorDefines(swigCPtr, this, defines);
  }

  public String getPreprocessorDefines() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getPreprocessorDefines(swigCPtr, this);
  }

  public String _resolveIncludes(String source, Resource resourceBeingLoaded, String fileName) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr__resolveIncludes(swigCPtr, this, source, Resource.getCPtr(resourceBeingLoaded), resourceBeingLoaded, fileName);
  }

  public String getProgramTypeName(GpuProgramType programType) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getProgramTypeName(swigCPtr, this, programType.swigValue());
  }

  public void setSourceFile(String filename) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setSourceFile(swigCPtr, this, filename);
  }

  public void setSource(String source) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setSource(swigCPtr, this, source);
  }

  public String getSyntaxCode() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getSyntaxCode(swigCPtr, this);
  }

  public void setSyntaxCode(String syntax) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setSyntaxCode(swigCPtr, this, syntax);
  }

  public String getSourceFile() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getSourceFile(swigCPtr, this);
  }

  public String getSource() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getSource(swigCPtr, this);
  }

  public void setType(GpuProgramType t) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setType(swigCPtr, this, t.swigValue());
  }

  public void setSkeletalAnimationIncluded(boolean included) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setSkeletalAnimationIncluded(swigCPtr, this, included);
  }

  public void setMorphAnimationIncluded(boolean included) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setMorphAnimationIncluded(swigCPtr, this, included);
  }

  public void setPoseAnimationIncluded(int poseCount) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setPoseAnimationIncluded(swigCPtr, this, poseCount);
  }

  public void setVertexTextureFetchRequired(boolean r) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setVertexTextureFetchRequired(swigCPtr, this, r);
  }

  public void setAdjacencyInfoRequired(boolean r) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setAdjacencyInfoRequired(swigCPtr, this, r);
  }

  public boolean isAdjacencyInfoRequired() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isAdjacencyInfoRequired(swigCPtr, this);
  }

  public void setComputeGroupDimensions(Vector3 dimensions) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setComputeGroupDimensions(swigCPtr, this, Vector3.getCPtr(dimensions), dimensions);
  }

  public Vector3 getComputeGroupDimensions() {
    return new Vector3(OgreJNI.UnifiedHighLevelGpuProgramPtr_getComputeGroupDimensions(swigCPtr, this), true);
  }

  public void setManualNamedConstants(GpuNamedConstants namedConstants) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setManualNamedConstants(swigCPtr, this, GpuNamedConstants.getCPtr(namedConstants), namedConstants);
  }

  public void setManualNamedConstantsFile(String paramDefFile) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setManualNamedConstantsFile(swigCPtr, this, paramDefFile);
  }

  public String getManualNamedConstantsFile() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getManualNamedConstantsFile(swigCPtr, this);
  }

  public long _getHash(long seed) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr__getHash__SWIG_0(swigCPtr, this, seed);
  }

  public long _getHash() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr__getHash__SWIG_1(swigCPtr, this);
  }

  public void prepare(boolean backgroundThread) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_prepare__SWIG_1(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isManuallyLoaded(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getName(swigCPtr, this);
  }

  public java.math.BigInteger getHandle() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_isPrepared(swigCPtr, this);
  }

  public String getGroup() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreJNI.UnifiedHighLevelGpuProgramPtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr__fireUnloadingComplete(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreJNI.UnifiedHighLevelGpuProgramPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreJNI.UnifiedHighLevelGpuProgramPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(NameValuePairList paramList) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_setParameterList(swigCPtr, this, NameValuePairList.getCPtr(paramList), paramList);
  }

  public String getParameter(String name) {
    return OgreJNI.UnifiedHighLevelGpuProgramPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreJNI.UnifiedHighLevelGpuProgramPtr_cleanupDictionary(swigCPtr, this);
  }

}