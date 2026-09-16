package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.EqualSpacingLayout.class)
public class EqualSpacingLayout103762973Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_354561509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354561509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1837221041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837221041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_133161399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133161399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements__729417747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-729417747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_491111012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(491111012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1323698701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1323698701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultChildLayoutSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultChildLayoutSetting_1001167231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001167231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newChildLayoutSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newChildLayoutSettings__626754431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626754431L))
            info.setReturnValue(null);
    }


}
