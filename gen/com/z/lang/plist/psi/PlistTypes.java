// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.z.lang.plist.PlistElementType;
import com.z.lang.plist.PlistTokenType;
import com.z.lang.plist.psi.impl.*;

public interface PlistTypes {

  IElementType ARRAY = new PlistElementType("ARRAY");
  IElementType ARRAY_ITEM = new PlistElementType("ARRAY_ITEM");
  IElementType ITEM = new PlistElementType("ITEM");
  IElementType OBJECT = new PlistElementType("OBJECT");
  IElementType PROP = new PlistElementType("PROP");
  IElementType VALUE = new PlistElementType("VALUE");

  IElementType ASSIGNMENT = new PlistTokenType("=");
  IElementType BLOCK_COMMENT = new PlistTokenType("block_comment");
  IElementType BRACE1 = new PlistTokenType("{");
  IElementType BRACE2 = new PlistTokenType("}");
  IElementType COMMA = new PlistTokenType(",");
  IElementType LINE_COMMENT = new PlistTokenType("line_comment");
  IElementType PARENTHESIS1 = new PlistTokenType("(");
  IElementType PARENTHESIS2 = new PlistTokenType(")");
  IElementType SEMICOLON = new PlistTokenType(";");
  IElementType STRING = new PlistTokenType("string");
  IElementType SPACE = new PlistTokenType("SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY) {
        return new PlistArrayImpl(node);
      }
      else if (type == ARRAY_ITEM) {
        return new PlistArrayItemImpl(node);
      }
      else if (type == ITEM) {
        return new PlistItemImpl(node);
      }
      else if (type == OBJECT) {
        return new PlistObjectImpl(node);
      }
      else if (type == PROP) {
        return new PlistPropImpl(node);
      }
      else if (type == VALUE) {
        return new PlistValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
