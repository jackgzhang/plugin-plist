// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class PlistVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull PlistArray o) {
    visitPsiElement(o);
  }

  public void visitArrayItem(@NotNull PlistArrayItem o) {
    visitPsiElement(o);
  }

  public void visitItem(@NotNull PlistItem o) {
    visitPsiElement(o);
  }

  public void visitObject(@NotNull PlistObject o) {
    visitPsiElement(o);
  }

  public void visitProp(@NotNull PlistProp o) {
    visitPsiElement(o);
  }

  public void visitValue(@NotNull PlistValue o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
