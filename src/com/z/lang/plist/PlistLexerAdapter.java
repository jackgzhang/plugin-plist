package com.z.lang.plist;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class PlistLexerAdapter extends FlexAdapter {
    public PlistLexerAdapter() {
        super(new PlistLexer((Reader) null));
    }
}