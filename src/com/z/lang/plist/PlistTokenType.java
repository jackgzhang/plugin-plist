package com.z.lang.plist;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gzhang on 12/22/15.
 */
public class PlistTokenType extends IElementType {
    public PlistTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PlistLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PlistTokenType." + super.toString();
    }
}
