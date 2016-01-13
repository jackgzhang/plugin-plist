// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.z.lang.plist.psi.PlistProp;
import com.z.lang.plist.psi.PlistVisitor;
import org.jetbrains.annotations.NotNull;

import static com.z.lang.plist.psi.PlistTypes.STRING;

public class PlistPropImpl extends ASTWrapperPsiElement implements PlistProp {

  public PlistPropImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PlistVisitor) ((PlistVisitor)visitor).visitProp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getString() {
    return findNotNullChildByType(STRING);
  }

}
