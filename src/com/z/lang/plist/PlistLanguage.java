package com.z.lang.plist;

import com.intellij.lang.Language;

/**
 * Created by gzhang on 12/21/15.
 */
public class PlistLanguage extends Language{
    public static final PlistLanguage INSTANCE = new PlistLanguage();

    private PlistLanguage() {
        super("Plist");
    }
}
