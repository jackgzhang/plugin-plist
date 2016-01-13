package com.z.lang.plist;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gzhang on 12/22/15.
 */
public class PlistElementType extends IElementType {
    public PlistElementType(@NotNull @NonNls String debugName) {
        super(debugName, PlistLanguage.INSTANCE);
    }
}