package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.HeaderAndFooterLayout.class)
public class HeaderAndFooterLayout_224312319Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_262587057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(262587057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_905328731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(905328731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeaderHeight()I", cancellable = true)
    private void getHeaderHeight_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContentHeight()I", cancellable = true)
    private void getContentHeight_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_262587057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(262587057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_1438229290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438229290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_1438229290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438229290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFooterHeight(I)V", cancellable = true)
    private void setFooterHeight_1438229290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438229290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeaderHeight(I)V", cancellable = true)
    private void setHeaderHeight_1438229290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438229290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTitleHeader(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)V", cancellable = true)
    private void addTitleHeader__1604878975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1604878975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFooterHeight()I", cancellable = true)
    private void getFooterHeight_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToHeader(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToHeader__733380067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733380067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToHeader(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToHeader_1498060641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498060641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToFooter(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToFooter__733380067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733380067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToFooter(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToFooter_1498060641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498060641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToContents(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToContents__733380067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733380067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToContents(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addToContents_1498060641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498060641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_262574564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262574564L))
            info.setReturnValue(null);
    }


}
