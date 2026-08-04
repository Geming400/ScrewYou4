package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.advancements.AdvancementWidget.class)
public class AdvancementWidget_835367850Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_873630095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873630095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/screens/advancements/AdvancementWidget;)V", cancellable = true)
    private void addChild__1665002337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665002337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_873630095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873630095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_873630095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873630095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProgress(Lnet/minecraft/advancements/AdvancementProgress;)V", cancellable = true)
    private void setProgress__2011569658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011569658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_2050541681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050541681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(IIII)Z", cancellable = true)
    private void isMouseOver__1845256288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845256288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachToParent()V", cancellable = true)
    private void attachToParent_873642588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(873642588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractHover(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIFII)V", cancellable = true)
    private void extractHover__1424393283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1424393283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractConnectivity(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZ)V", cancellable = true)
    private void extractConnectivity__105849103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-105849103L))
            info.cancel();
    }


}
