/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HighLevelGpuProgramPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HighLevelGpuProgramPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HighLevelGpuProgramPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HighLevelGpuProgramPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HighLevelGpuProgramPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_HighLevelGpuProgramPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public HighLevelGpuProgramPtr() {
    this(OgreJNI.new_HighLevelGpuProgramPtr__SWIG_1(), true);
  }

  public HighLevelGpuProgramPtr(HighLevelGpuProgramPtr r) {
    this(OgreJNI.new_HighLevelGpuProgramPtr__SWIG_2(HighLevelGpuProgramPtr.getCPtr(r), r), true);
  }

  public HighLevelGpuProgram __deref__() {
    long cPtr = OgreJNI.HighLevelGpuProgramPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new HighLevelGpuProgram(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t createParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.HighLevelGpuProgramPtr_createParameters(swigCPtr, this), true);
  }

  public GpuProgram _getBindingDelegate() {
    long cPtr = OgreJNI.HighLevelGpuProgramPtr__getBindingDelegate(swigCPtr, this);
    return (cPtr == 0) ? null : new GpuProgram(cPtr, false);
  }

  public GpuNamedConstants getConstantDefinitions() {
    return new GpuNamedConstants(OgreJNI.HighLevelGpuProgramPtr_getConstantDefinitions(swigCPtr, this), false);
  }

  public long calculateSize() {
    return OgreJNI.HighLevelGpuProgramPtr_calculateSize(swigCPtr, this);
  }

  public void setPreprocessorDefines(String defines) {
    OgreJNI.HighLevelGpuProgramPtr_setPreprocessorDefines(swigCPtr, this, defines);
  }

  public String getPreprocessorDefines() {
    return OgreJNI.HighLevelGpuProgramPtr_getPreprocessorDefines(swigCPtr, this);
  }

  public String _resolveIncludes(String source, Resource resourceBeingLoaded, String fileName) {
    return OgreJNI.HighLevelGpuProgramPtr__resolveIncludes(swigCPtr, this, source, Resource.getCPtr(resourceBeingLoaded), resourceBeingLoaded, fileName);
  }

  public String getProgramTypeName(GpuProgramType programType) {
    return OgreJNI.HighLevelGpuProgramPtr_getProgramTypeName(swigCPtr, this, programType.swigValue());
  }

  public void setSourceFile(String filename) {
    OgreJNI.HighLevelGpuProgramPtr_setSourceFile(swigCPtr, this, filename);
  }

  public void setSource(String source) {
    OgreJNI.HighLevelGpuProgramPtr_setSource(swigCPtr, this, source);
  }

  public String getSyntaxCode() {
    return OgreJNI.HighLevelGpuProgramPtr_getSyntaxCode(swigCPtr, this);
  }

  public void setSyntaxCode(String syntax) {
    OgreJNI.HighLevelGpuProgramPtr_setSyntaxCode(swigCPtr, this, syntax);
  }

  public String getSourceFile() {
    return OgreJNI.HighLevelGpuProgramPtr_getSourceFile(swigCPtr, this);
  }

  public String getSource() {
    return OgreJNI.HighLevelGpuProgramPtr_getSource(swigCPtr, this);
  }

  public void setType(GpuProgramType t) {
    OgreJNI.HighLevelGpuProgramPtr_setType(swigCPtr, this, t.swigValue());
  }

  public boolean isSupported() {
    return OgreJNI.HighLevelGpuProgramPtr_isSupported(swigCPtr, this);
  }

  public void setSkeletalAnimationIncluded(boolean included) {
    OgreJNI.HighLevelGpuProgramPtr_setSkeletalAnimationIncluded(swigCPtr, this, included);
  }

  public boolean isSkeletalAnimationIncluded() {
    return OgreJNI.HighLevelGpuProgramPtr_isSkeletalAnimationIncluded(swigCPtr, this);
  }

  public void setMorphAnimationIncluded(boolean included) {
    OgreJNI.HighLevelGpuProgramPtr_setMorphAnimationIncluded(swigCPtr, this, included);
  }

  public void setPoseAnimationIncluded(int poseCount) {
    OgreJNI.HighLevelGpuProgramPtr_setPoseAnimationIncluded(swigCPtr, this, poseCount);
  }

  public boolean isMorphAnimationIncluded() {
    return OgreJNI.HighLevelGpuProgramPtr_isMorphAnimationIncluded(swigCPtr, this);
  }

  public boolean isPoseAnimationIncluded() {
    return OgreJNI.HighLevelGpuProgramPtr_isPoseAnimationIncluded(swigCPtr, this);
  }

  public int getNumberOfPosesIncluded() {
    return OgreJNI.HighLevelGpuProgramPtr_getNumberOfPosesIncluded(swigCPtr, this);
  }

  public void setVertexTextureFetchRequired(boolean r) {
    OgreJNI.HighLevelGpuProgramPtr_setVertexTextureFetchRequired(swigCPtr, this, r);
  }

  public boolean isVertexTextureFetchRequired() {
    return OgreJNI.HighLevelGpuProgramPtr_isVertexTextureFetchRequired(swigCPtr, this);
  }

  public void setAdjacencyInfoRequired(boolean r) {
    OgreJNI.HighLevelGpuProgramPtr_setAdjacencyInfoRequired(swigCPtr, this, r);
  }

  public boolean isAdjacencyInfoRequired() {
    return OgreJNI.HighLevelGpuProgramPtr_isAdjacencyInfoRequired(swigCPtr, this);
  }

  public void setComputeGroupDimensions(Vector3 dimensions) {
    OgreJNI.HighLevelGpuProgramPtr_setComputeGroupDimensions(swigCPtr, this, Vector3.getCPtr(dimensions), dimensions);
  }

  public Vector3 getComputeGroupDimensions() {
    return new Vector3(OgreJNI.HighLevelGpuProgramPtr_getComputeGroupDimensions(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t getDefaultParameters() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t(OgreJNI.HighLevelGpuProgramPtr_getDefaultParameters(swigCPtr, this), true);
  }

  public boolean hasDefaultParameters() {
    return OgreJNI.HighLevelGpuProgramPtr_hasDefaultParameters(swigCPtr, this);
  }

  public boolean getPassSurfaceAndLightStates() {
    return OgreJNI.HighLevelGpuProgramPtr_getPassSurfaceAndLightStates(swigCPtr, this);
  }

  public boolean getPassFogStates() {
    return OgreJNI.HighLevelGpuProgramPtr_getPassFogStates(swigCPtr, this);
  }

  public boolean getPassTransformStates() {
    return OgreJNI.HighLevelGpuProgramPtr_getPassTransformStates(swigCPtr, this);
  }

  public String getLanguage() {
    return OgreJNI.HighLevelGpuProgramPtr_getLanguage(swigCPtr, this);
  }

  public boolean hasCompileError() {
    return OgreJNI.HighLevelGpuProgramPtr_hasCompileError(swigCPtr, this);
  }

  public void resetCompileError() {
    OgreJNI.HighLevelGpuProgramPtr_resetCompileError(swigCPtr, this);
  }

  public void setManualNamedConstants(GpuNamedConstants namedConstants) {
    OgreJNI.HighLevelGpuProgramPtr_setManualNamedConstants(swigCPtr, this, GpuNamedConstants.getCPtr(namedConstants), namedConstants);
  }

  public void setManualNamedConstantsFile(String paramDefFile) {
    OgreJNI.HighLevelGpuProgramPtr_setManualNamedConstantsFile(swigCPtr, this, paramDefFile);
  }

  public String getManualNamedConstantsFile() {
    return OgreJNI.HighLevelGpuProgramPtr_getManualNamedConstantsFile(swigCPtr, this);
  }

  public long _getHash(long seed) {
    return OgreJNI.HighLevelGpuProgramPtr__getHash__SWIG_0(swigCPtr, this, seed);
  }

  public long _getHash() {
    return OgreJNI.HighLevelGpuProgramPtr__getHash__SWIG_1(swigCPtr, this);
  }

  public void prepare(boolean backgroundThread) {
    OgreJNI.HighLevelGpuProgramPtr_prepare__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void prepare() {
    OgreJNI.HighLevelGpuProgramPtr_prepare__SWIG_1(swigCPtr, this);
  }

  public void load(boolean backgroundThread) {
    OgreJNI.HighLevelGpuProgramPtr_load__SWIG_0(swigCPtr, this, backgroundThread);
  }

  public void load() {
    OgreJNI.HighLevelGpuProgramPtr_load__SWIG_1(swigCPtr, this);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.HighLevelGpuProgramPtr_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.HighLevelGpuProgramPtr_reload__SWIG_1(swigCPtr, this);
  }

  public boolean isReloadable() {
    return OgreJNI.HighLevelGpuProgramPtr_isReloadable(swigCPtr, this);
  }

  public boolean isManuallyLoaded() {
    return OgreJNI.HighLevelGpuProgramPtr_isManuallyLoaded(swigCPtr, this);
  }

  public void unload() {
    OgreJNI.HighLevelGpuProgramPtr_unload(swigCPtr, this);
  }

  public long getSize() {
    return OgreJNI.HighLevelGpuProgramPtr_getSize(swigCPtr, this);
  }

  public void touch() {
    OgreJNI.HighLevelGpuProgramPtr_touch(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.HighLevelGpuProgramPtr_getName(swigCPtr, this);
  }

  public java.math.BigInteger getHandle() {
    return OgreJNI.HighLevelGpuProgramPtr_getHandle(swigCPtr, this);
  }

  public boolean isPrepared() {
    return OgreJNI.HighLevelGpuProgramPtr_isPrepared(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.HighLevelGpuProgramPtr_isLoaded(swigCPtr, this);
  }

  public boolean isLoading() {
    return OgreJNI.HighLevelGpuProgramPtr_isLoading(swigCPtr, this);
  }

  public Resource.LoadingState getLoadingState() {
    return Resource.LoadingState.swigToEnum(OgreJNI.HighLevelGpuProgramPtr_getLoadingState(swigCPtr, this));
  }

  public boolean isBackgroundLoaded() {
    return OgreJNI.HighLevelGpuProgramPtr_isBackgroundLoaded(swigCPtr, this);
  }

  public void setBackgroundLoaded(boolean bl) {
    OgreJNI.HighLevelGpuProgramPtr_setBackgroundLoaded(swigCPtr, this, bl);
  }

  public void escalateLoading() {
    OgreJNI.HighLevelGpuProgramPtr_escalateLoading(swigCPtr, this);
  }

  public void addListener(Resource.Listener lis) {
    OgreJNI.HighLevelGpuProgramPtr_addListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public void removeListener(Resource.Listener lis) {
    OgreJNI.HighLevelGpuProgramPtr_removeListener(swigCPtr, this, Resource.Listener.getCPtr(lis), lis);
  }

  public String getGroup() {
    return OgreJNI.HighLevelGpuProgramPtr_getGroup(swigCPtr, this);
  }

  public void changeGroupOwnership(String newGroup) {
    OgreJNI.HighLevelGpuProgramPtr_changeGroupOwnership(swigCPtr, this, newGroup);
  }

  public ResourceManager getCreator() {
    long cPtr = OgreJNI.HighLevelGpuProgramPtr_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new ResourceManager(cPtr, false);
  }

  public String getOrigin() {
    return OgreJNI.HighLevelGpuProgramPtr_getOrigin(swigCPtr, this);
  }

  public void _notifyOrigin(String origin) {
    OgreJNI.HighLevelGpuProgramPtr__notifyOrigin(swigCPtr, this, origin);
  }

  public long getStateCount() {
    return OgreJNI.HighLevelGpuProgramPtr_getStateCount(swigCPtr, this);
  }

  public void _dirtyState() {
    OgreJNI.HighLevelGpuProgramPtr__dirtyState(swigCPtr, this);
  }

  public void _fireLoadingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.HighLevelGpuProgramPtr__fireLoadingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _firePreparingComplete(boolean wasBackgroundLoaded) {
    OgreJNI.HighLevelGpuProgramPtr__firePreparingComplete(swigCPtr, this, wasBackgroundLoaded);
  }

  public void _fireUnloadingComplete() {
    OgreJNI.HighLevelGpuProgramPtr__fireUnloadingComplete(swigCPtr, this);
  }

  public ParamDictionary getParamDictionary() {
    long cPtr = OgreJNI.HighLevelGpuProgramPtr_getParamDictionary__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ParamDictionary(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t getParameters() {
    return new SWIGTYPE_p_std__vectorT_Ogre__ParameterDef_t(OgreJNI.HighLevelGpuProgramPtr_getParameters(swigCPtr, this), false);
  }

  public boolean setParameter(String name, String value) {
    return OgreJNI.HighLevelGpuProgramPtr_setParameter(swigCPtr, this, name, value);
  }

  public void setParameterList(NameValuePairList paramList) {
    OgreJNI.HighLevelGpuProgramPtr_setParameterList(swigCPtr, this, NameValuePairList.getCPtr(paramList), paramList);
  }

  public String getParameter(String name) {
    return OgreJNI.HighLevelGpuProgramPtr_getParameter(swigCPtr, this, name);
  }

  public void copyParametersTo(StringInterface dest) {
    OgreJNI.HighLevelGpuProgramPtr_copyParametersTo(swigCPtr, this, StringInterface.getCPtr(dest), dest);
  }

  public void cleanupDictionary() {
    OgreJNI.HighLevelGpuProgramPtr_cleanupDictionary(swigCPtr, this);
  }

}