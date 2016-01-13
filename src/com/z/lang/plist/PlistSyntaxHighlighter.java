package com.z.lang.plist;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.z.lang.plist.psi.PlistTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PlistSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey STRING = createTextAttributesKey("PLIST_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("PLIST_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("PLIST_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey BRACE = createTextAttributesKey("PLIST_BRACE", HighlighterColors.TEXT);
    public static final TextAttributesKey ASSIGNMENT = createTextAttributesKey("PLIST_ASSIGNMENT", HighlighterColors.TEXT);
    public static final TextAttributesKey PARENTHESIS = createTextAttributesKey("PLIST_PARENTHESIS", HighlighterColors.TEXT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("PLIST_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] ASSIGNMENT_KEYS = new TextAttributesKey[]{ASSIGNMENT};
    private static final TextAttributesKey[] BRACE_KEYS = new TextAttributesKey[]{BRACE};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] PARENTHESIS_KEYS = new TextAttributesKey[]{PARENTHESIS};



    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PlistLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(PlistTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(PlistTypes.LINE_COMMENT)) {
            return LINE_COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (tokenType.equals(PlistTypes.ASSIGNMENT)) {
            return ASSIGNMENT_KEYS;
        } else if ( (tokenType.equals(PlistTypes.BRACE1) || (tokenType.equals(PlistTypes.BRACE2)))) {
            return BRACE_KEYS;
        } else if ( (tokenType.equals(PlistTypes.PARENTHESIS1) || (tokenType.equals(PlistTypes.PARENTHESIS2)))) {
            return PARENTHESIS_KEYS;
        } else if (tokenType.equals(PlistTypes.BLOCK_COMMENT)) {
            return BLOCK_COMMENT_KEYS;
        }

        else {
            return EMPTY_KEYS;
        }
    }
}
