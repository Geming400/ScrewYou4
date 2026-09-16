package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiItemRenderState.class)
public class GuiItemRenderState1598333955Mixin {
        @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_777127025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777127025L))
            info.setReturnValue(1005480871);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__868598394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868598394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_805756176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805756176L))
            info.setReturnValue(-525985323);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2f;", cancellable = true)
    private void pose__759539172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759539172L))
            info.setReturnValue(new org.joml.Matrix3x2f());
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__926566350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926566350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oversizedItemBounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void oversizedItemBounds_1234843972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234843972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStackRenderState()Lnet/minecraft/client/renderer/item/TrackingItemStackRenderState;", cancellable = true)
    private void itemStackRenderState_708659428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708659428L))
            info.setReturnValue(null);
    }


}
