package com.z.lang.plist;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.swing.*;
import java.util.Map;

/**
 * Created by gzhang on 1/11/16.
 */
public class PlistColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("String", PlistSyntaxHighlighter.STRING),
            new AttributesDescriptor("Line Comment", PlistSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Assignment", PlistSyntaxHighlighter.ASSIGNMENT),
            new AttributesDescriptor("Brace", PlistSyntaxHighlighter.BRACE),
            new AttributesDescriptor("Parenthesis", PlistSyntaxHighlighter.PARENTHESIS),
            new AttributesDescriptor("Block Comment", PlistSyntaxHighlighter.BLOCK_COMMENT)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return PlistIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PlistSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "{\n" +
                "    META = {\n" +
                "        contextScope = {\n" +
                "            mode = \"test\";\n" +
                "            layer = \"all.dev.desktop\";\n" +
                "            user = \"test\";\n" +
                "        };\n" +
                "     };\n" +
                "\n" +
                "    // Line Comment\n" +
                "    \"key1\" = \"value\";\n" +
                "    \"key2\" = (a, b, c);\n" +
                "    /* Block Comment */\n" +
                "    \"key3\" = (a, b, \"c\");\n" +
                "}";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Plist";
    }
}
