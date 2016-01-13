package com.z.lang.plist;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import com.z.lang.plist.psi.PlistObject;
import com.z.lang.plist.psi.PlistTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PlistFoldingBuilder extends FoldingBuilderEx implements DumbAware {
    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {

        System.err.println("FF");

        if (!(root instanceof PlistFile)) return FoldingDescriptor.EMPTY;

        PlistFile file = (PlistFile)root;

        final List<FoldingDescriptor> result = ContainerUtil.newArrayList();

        if (! quick) {
            // Add condition to check if tokens pair
            PsiTreeUtil.processElements(file, new PsiElementProcessor() {
                @Override
                public boolean execute(@NotNull PsiElement element) {
                    if (TokenSet.create(PlistTypes.OBJECT,
                            PlistTypes.ARRAY,
                            PlistTypes.BLOCK_COMMENT
                    ).contains(element.getNode().getElementType()) && element.getTextRange().getLength() > 2) {
                        result.add(new FoldingDescriptor(element, element.getTextRange()));
                    }
                    return true;
                }
            });
        }



        return result.toArray(new FoldingDescriptor[result.size()]);
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        PsiElement psi = node.getPsi();
        if (psi instanceof PlistObject) return "{...}";
        if (node.getElementType() == PlistTypes.BLOCK_COMMENT) return "/*..*/";
        return "...";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }
}