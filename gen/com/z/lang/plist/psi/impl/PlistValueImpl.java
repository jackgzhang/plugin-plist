// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.z.lang.plist.psi.PlistTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.z.lang.plist.psi.*;
import com.z.lang.plist.PlistPsiImplUtil;

public class PlistValueImpl extends ASTWrapperPsiElement implements PlistValue {

  public PlistValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PlistVisitor) ((PlistVisitor)visitor).visitValue(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PlistArray getArray() {
    return findChildByClass(PlistArray.class);
  }

  @Override
  @Nullable
  public PlistObject getObject() {
    return findChildByClass(PlistObject.class);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
