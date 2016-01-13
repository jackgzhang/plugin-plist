// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.z.lang.plist.psi.PlistItem;
import com.z.lang.plist.psi.PlistProp;
import com.z.lang.plist.psi.PlistValue;
import com.z.lang.plist.psi.PlistVisitor;
import org.jetbrains.annotations.NotNull;

public class PlistItemImpl extends ASTWrapperPsiElement implements PlistItem {

  public PlistItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PlistVisitor) ((PlistVisitor)visitor).visitItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PlistProp getProp() {
    return findNotNullChildByClass(PlistProp.class);
  }

  @Override
  @NotNull
  public PlistValue getValue() {
    return findNotNullChildByClass(PlistValue.class);
  }

}
