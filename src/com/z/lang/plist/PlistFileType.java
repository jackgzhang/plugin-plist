package com.z.lang.plist;

/**
 * Created by gzhang on 12/21/15.
 */
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PlistFileType extends LanguageFileType {
    public static final PlistFileType INSTANCE = new PlistFileType();

    private PlistFileType() {
        super(PlistLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Plist file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Plist language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "plist";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return PlistIcons.FILE;
    }
}