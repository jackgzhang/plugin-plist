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

public class PlistArrayItemImpl extends ASTWrapperPsiElement implements PlistArrayItem {

  public PlistArrayItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PlistVisitor) ((PlistVisitor)visitor).visitArrayItem(this);
    else super.accept(visitor);
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
