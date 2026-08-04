package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiItemRenderState.class)
public class GuiItemRenderState1598333955Mixin {
        @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1636596201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636596201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1521608037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521608037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1636596201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636596201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1521608037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521608037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oversizedItemBounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void oversizedItemBounds__1521608037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521608037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStackRenderState()Lnet/minecraft/client/renderer/item/TrackingItemStackRenderState;", cancellable = true)
    private void itemStackRenderState__1752724662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752724662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2f;", cancellable = true)
    private void pose__621027955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621027955L))
            info.setReturnValue(null);
    }


}
