package com.z.lang.plist;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.z.lang.plist.psi.PlistTypes.*;

%%

%{
  public PlistLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class PlistLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

SPACE=[ \t\n\x0B\f\r]+
STRING=\"[^\"]*\"|[a-zA-Z_0-9]*
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*((?<!\*"/")(.|\n))*

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }

  ","                  { return COMMA; }
  "{"                  { return BRACE1; }
  "}"                  { return BRACE2; }
  "("                  { return PARENTHESIS1; }
  ")"                  { return PARENTHESIS2; }
  ";"                  { return SEMICOLON; }
  "="                  { return ASSIGNMENT; }

  {SPACE}              { return SPACE; }
  {STRING}             { return STRING; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
