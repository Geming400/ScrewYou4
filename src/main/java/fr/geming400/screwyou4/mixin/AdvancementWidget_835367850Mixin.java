package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementWidget.class)
public class AdvancementWidget_835367850Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1738805164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738805164L))
            info.setReturnValue(-228388310);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;)V", cancellable = true)
    private void addChild__722756262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-722756262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1710176013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710176013L))
            info.setReturnValue(657859436);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIII)Z", cancellable = true)
    private void isMouseOver_1332906865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332906865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "attachToParent()V", cancellable = true)
    private void attachToParent__294767566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-294767566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractConnectivity(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZ)V", cancellable = true)
    private void extractConnectivity_1781328665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1781328665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractHover(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIFII)V", cancellable = true)
    private void extractHover_1818413794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818413794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setProgress(Lnet/minecraft/advancements/AdvancementProgress;)V", cancellable = true)
    private void setProgress__136703817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-136703817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1102528641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102528641L))
            info.setReturnValue(2068993736);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__380517813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-380517813L))
            info.cancel();
    }


}
