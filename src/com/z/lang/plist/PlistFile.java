package com.z.lang.plist;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PlistFile extends PsiFileBase {
    public PlistFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PlistLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PlistFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Plist File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}