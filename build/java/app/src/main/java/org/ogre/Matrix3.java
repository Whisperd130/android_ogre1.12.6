/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Matrix3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Matrix3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Matrix3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Matrix3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Matrix3() {
    this(OgreJNI.new_Matrix3__SWIG_0(), true);
  }

  public Matrix3(SWIGTYPE_p_a_3__float arr) {
    this(OgreJNI.new_Matrix3__SWIG_1(SWIGTYPE_p_a_3__float.getCPtr(arr)), true);
  }

  public Matrix3(float fEntry00, float fEntry01, float fEntry02, float fEntry10, float fEntry11, float fEntry12, float fEntry20, float fEntry21, float fEntry22) {
    this(OgreJNI.new_Matrix3__SWIG_2(fEntry00, fEntry01, fEntry02, fEntry10, fEntry11, fEntry12, fEntry20, fEntry21, fEntry22), true);
  }

  public Vector3 GetColumn(long iCol) {
    return new Vector3(OgreJNI.Matrix3_GetColumn(swigCPtr, this, iCol), true);
  }

  public void SetColumn(long iCol, Vector3 vec) {
    OgreJNI.Matrix3_SetColumn(swigCPtr, this, iCol, Vector3.getCPtr(vec), vec);
  }

  public void FromAxes(Vector3 xAxis, Vector3 yAxis, Vector3 zAxis) {
    OgreJNI.Matrix3_FromAxes(swigCPtr, this, Vector3.getCPtr(xAxis), xAxis, Vector3.getCPtr(yAxis), yAxis, Vector3.getCPtr(zAxis), zAxis);
  }

  public Matrix3 __add__(Matrix3 rkMatrix) {
    return new Matrix3(OgreJNI.Matrix3___add__(swigCPtr, this, Matrix3.getCPtr(rkMatrix), rkMatrix), true);
  }

  public Matrix3 __sub__(Matrix3 rkMatrix) {
    return new Matrix3(OgreJNI.Matrix3___sub____SWIG_0(swigCPtr, this, Matrix3.getCPtr(rkMatrix), rkMatrix), true);
  }

  public Matrix3 __mul__(Matrix3 rkMatrix) {
    return new Matrix3(OgreJNI.Matrix3___mul____SWIG_0(swigCPtr, this, Matrix3.getCPtr(rkMatrix), rkMatrix), true);
  }

  public Matrix3 __sub__() {
    return new Matrix3(OgreJNI.Matrix3___sub____SWIG_1(swigCPtr, this), true);
  }

  public Matrix3 __mul__(float fScalar) {
    return new Matrix3(OgreJNI.Matrix3___mul____SWIG_1(swigCPtr, this, fScalar), true);
  }

  public Matrix3 Transpose() {
    return new Matrix3(OgreJNI.Matrix3_Transpose(swigCPtr, this), true);
  }

  public boolean Inverse(Matrix3 rkInverse, float fTolerance) {
    return OgreJNI.Matrix3_Inverse__SWIG_0(swigCPtr, this, Matrix3.getCPtr(rkInverse), rkInverse, fTolerance);
  }

  public boolean Inverse(Matrix3 rkInverse) {
    return OgreJNI.Matrix3_Inverse__SWIG_1(swigCPtr, this, Matrix3.getCPtr(rkInverse), rkInverse);
  }

  public Matrix3 Inverse(float fTolerance) {
    return new Matrix3(OgreJNI.Matrix3_Inverse__SWIG_2(swigCPtr, this, fTolerance), true);
  }

  public Matrix3 Inverse() {
    return new Matrix3(OgreJNI.Matrix3_Inverse__SWIG_3(swigCPtr, this), true);
  }

  public float Determinant() {
    return OgreJNI.Matrix3_Determinant(swigCPtr, this);
  }

  public Matrix3 transpose() {
    return new Matrix3(OgreJNI.Matrix3_transpose(swigCPtr, this), true);
  }

  public Matrix3 inverse() {
    return new Matrix3(OgreJNI.Matrix3_inverse(swigCPtr, this), true);
  }

  public float determinant() {
    return OgreJNI.Matrix3_determinant(swigCPtr, this);
  }

  public boolean hasNegativeScale() {
    return OgreJNI.Matrix3_hasNegativeScale(swigCPtr, this);
  }

  public void SingularValueDecomposition(Matrix3 rkL, Vector3 rkS, Matrix3 rkR) {
    OgreJNI.Matrix3_SingularValueDecomposition(swigCPtr, this, Matrix3.getCPtr(rkL), rkL, Vector3.getCPtr(rkS), rkS, Matrix3.getCPtr(rkR), rkR);
  }

  public void SingularValueComposition(Matrix3 rkL, Vector3 rkS, Matrix3 rkR) {
    OgreJNI.Matrix3_SingularValueComposition(swigCPtr, this, Matrix3.getCPtr(rkL), rkL, Vector3.getCPtr(rkS), rkS, Matrix3.getCPtr(rkR), rkR);
  }

  public Matrix3 orthonormalised() {
    return new Matrix3(OgreJNI.Matrix3_orthonormalised(swigCPtr, this), true);
  }

  public void Orthonormalize() {
    OgreJNI.Matrix3_Orthonormalize(swigCPtr, this);
  }

  public void QDUDecomposition(Matrix3 rkQ, Vector3 rkD, Vector3 rkU) {
    OgreJNI.Matrix3_QDUDecomposition(swigCPtr, this, Matrix3.getCPtr(rkQ), rkQ, Vector3.getCPtr(rkD), rkD, Vector3.getCPtr(rkU), rkU);
  }

  public float SpectralNorm() {
    return OgreJNI.Matrix3_SpectralNorm(swigCPtr, this);
  }

  public void ToAngleAxis(Vector3 rkAxis, Radian rfAngle) {
    OgreJNI.Matrix3_ToAngleAxis__SWIG_0(swigCPtr, this, Vector3.getCPtr(rkAxis), rkAxis, Radian.getCPtr(rfAngle), rfAngle);
  }

  public void ToAngleAxis(Vector3 rkAxis, Degree rfAngle) {
    OgreJNI.Matrix3_ToAngleAxis__SWIG_1(swigCPtr, this, Vector3.getCPtr(rkAxis), rkAxis, Degree.getCPtr(rfAngle), rfAngle);
  }

  public void FromAngleAxis(Vector3 rkAxis, Radian fRadians) {
    OgreJNI.Matrix3_FromAngleAxis(swigCPtr, this, Vector3.getCPtr(rkAxis), rkAxis, Radian.getCPtr(fRadians), fRadians);
  }

  public boolean ToEulerAnglesXYZ(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesXYZ(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public boolean ToEulerAnglesXZY(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesXZY(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public boolean ToEulerAnglesYXZ(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesYXZ(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public boolean ToEulerAnglesYZX(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesYZX(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public boolean ToEulerAnglesZXY(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesZXY(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public boolean ToEulerAnglesZYX(Radian rfYAngle, Radian rfPAngle, Radian rfRAngle) {
    return OgreJNI.Matrix3_ToEulerAnglesZYX(swigCPtr, this, Radian.getCPtr(rfYAngle), rfYAngle, Radian.getCPtr(rfPAngle), rfPAngle, Radian.getCPtr(rfRAngle), rfRAngle);
  }

  public void FromEulerAnglesXYZ(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesXYZ(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void FromEulerAnglesXZY(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesXZY(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void FromEulerAnglesYXZ(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesYXZ(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void FromEulerAnglesYZX(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesYZX(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void FromEulerAnglesZXY(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesZXY(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void FromEulerAnglesZYX(Radian fYAngle, Radian fPAngle, Radian fRAngle) {
    OgreJNI.Matrix3_FromEulerAnglesZYX(swigCPtr, this, Radian.getCPtr(fYAngle), fYAngle, Radian.getCPtr(fPAngle), fPAngle, Radian.getCPtr(fRAngle), fRAngle);
  }

  public void EigenSolveSymmetric(SWIGTYPE_p_float afEigenvalue, Vector3 akEigenvector) {
    OgreJNI.Matrix3_EigenSolveSymmetric(swigCPtr, this, SWIGTYPE_p_float.getCPtr(afEigenvalue), Vector3.getCPtr(akEigenvector), akEigenvector);
  }

  public static void TensorProduct(Vector3 rkU, Vector3 rkV, Matrix3 rkProduct) {
    OgreJNI.Matrix3_TensorProduct(Vector3.getCPtr(rkU), rkU, Vector3.getCPtr(rkV), rkV, Matrix3.getCPtr(rkProduct), rkProduct);
  }

  public boolean hasScale() {
    return OgreJNI.Matrix3_hasScale(swigCPtr, this);
  }

  public static float getEPSILON() {
    return OgreJNI.Matrix3_EPSILON_get();
  }

  public static Matrix3 getZERO() {
    long cPtr = OgreJNI.Matrix3_ZERO_get();
    return (cPtr == 0) ? null : new Matrix3(cPtr, false);
  }

  public static Matrix3 getIDENTITY() {
    long cPtr = OgreJNI.Matrix3_IDENTITY_get();
    return (cPtr == 0) ? null : new Matrix3(cPtr, false);
  }

  public String toString() {
    return OgreJNI.Matrix3_toString(swigCPtr, this);
  }

  public Vector3 __mul__(Vector3 v) {
    return new Vector3(OgreJNI.Matrix3___mul____SWIG_2(swigCPtr, this, Vector3.getCPtr(v), v), true);
  }

}