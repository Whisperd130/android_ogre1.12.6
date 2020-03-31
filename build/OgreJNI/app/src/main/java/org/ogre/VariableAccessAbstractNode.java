/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class VariableAccessAbstractNode extends AbstractNode {
  private transient long swigCPtr;

  protected VariableAccessAbstractNode(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.VariableAccessAbstractNode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VariableAccessAbstractNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_VariableAccessAbstractNode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setName(String value) {
    OgreJNI.VariableAccessAbstractNode_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return OgreJNI.VariableAccessAbstractNode_name_get(swigCPtr, this);
  }

  public VariableAccessAbstractNode(AbstractNode ptr) {
    this(OgreJNI.new_VariableAccessAbstractNode(AbstractNode.getCPtr(ptr), ptr), true);
  }

  public AbstractNode clone() {
    long cPtr = OgreJNI.VariableAccessAbstractNode_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractNode(cPtr, false);
  }

  public String getValue() {
    return OgreJNI.VariableAccessAbstractNode_getValue(swigCPtr, this);
  }

}