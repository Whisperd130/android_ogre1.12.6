/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class CreateMaterialScriptCompilerEvent extends ScriptCompilerEvent {
  private transient long swigCPtr;

  protected CreateMaterialScriptCompilerEvent(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.CreateMaterialScriptCompilerEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CreateMaterialScriptCompilerEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CreateMaterialScriptCompilerEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMFile(String value) {
    OgreJNI.CreateMaterialScriptCompilerEvent_mFile_set(swigCPtr, this, value);
  }

  public String getMFile() {
    return OgreJNI.CreateMaterialScriptCompilerEvent_mFile_get(swigCPtr, this);
  }

  public void setMName(String value) {
    OgreJNI.CreateMaterialScriptCompilerEvent_mName_set(swigCPtr, this, value);
  }

  public String getMName() {
    return OgreJNI.CreateMaterialScriptCompilerEvent_mName_get(swigCPtr, this);
  }

  public void setMResourceGroup(String value) {
    OgreJNI.CreateMaterialScriptCompilerEvent_mResourceGroup_set(swigCPtr, this, value);
  }

  public String getMResourceGroup() {
    return OgreJNI.CreateMaterialScriptCompilerEvent_mResourceGroup_get(swigCPtr, this);
  }

  public static void setEventType(String value) {
    OgreJNI.CreateMaterialScriptCompilerEvent_eventType_set(value);
  }

  public static String getEventType() {
    return OgreJNI.CreateMaterialScriptCompilerEvent_eventType_get();
  }

  public CreateMaterialScriptCompilerEvent(String file, String name, String resourceGroup) {
    this(OgreJNI.new_CreateMaterialScriptCompilerEvent(file, name, resourceGroup), true);
  }

}
