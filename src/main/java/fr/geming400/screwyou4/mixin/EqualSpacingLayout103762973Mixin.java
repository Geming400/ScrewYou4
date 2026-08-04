package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.EqualSpacingLayout.class)
public class EqualSpacingLayout103762973Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_182278506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182278506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__853929412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853929412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1377511296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377511296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newChildLayoutSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newChildLayoutSettings_38783178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38783178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultChildLayoutSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultChildLayoutSetting_38783178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38783178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_142037712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(142037712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_784779386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(784779386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_142037712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(142037712L))
            info.cancel();
    }


}
