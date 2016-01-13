// This is a generated file. Not intended for manual editing.
package com.z.lang.plist.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.z.lang.plist.parser.PlistParserUtil.*;
import static com.z.lang.plist.psi.PlistTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PlistParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARRAY) {
      r = array(b, 0);
    }
    else if (t == ARRAY_ITEM) {
      r = array_item(b, 0);
    }
    else if (t == ITEM) {
      r = item(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == PROP) {
      r = prop(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // parenthesis1 array_item  (',' array_item)* parenthesis2
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, PARENTHESIS1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS1);
    r = r && array_item(b, l + 1);
    r = r && array_2(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS2);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // (',' array_item)*
  private static boolean array_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' array_item
  private static boolean array_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && array_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ string | object ]
  public static boolean array_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_item")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<array item>");
    array_item_0(b, l + 1);
    exit_section_(b, l, m, ARRAY_ITEM, true, false, null);
    return true;
  }

  // string | object
  private static boolean array_item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_item_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // prop '=' value ';'
  public static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop(b, l + 1);
    r = r && consumeToken(b, ASSIGNMENT);
    r = r && value(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // brace1 item* brace2
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, BRACE1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE1);
    r = r && object_1(b, l + 1);
    r = r && consumeToken(b, BRACE2);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  // item*
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // string
  public static boolean prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, PROP, r);
    return r;
  }

  /* ********************************************************** */
  // object
  static boolean root(PsiBuilder b, int l) {
    return object(b, l + 1);
  }

  /* ********************************************************** */
  // [string | array | object ]
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<value>");
    value_0(b, l + 1);
    exit_section_(b, l, m, VALUE, true, false, null);
    return true;
  }

  // string | array | object
  private static boolean value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = array(b, l + 1);
    if (!r) r = object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
