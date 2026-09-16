package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.EnchantmentScreen.class)
public class EnchantmentScreen_2050392907Mixin {
        @Inject(at = @At("HEAD"), method = "tickBook()V", cancellable = true)
    private void tickBook_1368328087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368328087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1509886730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509886730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1257694748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1257694748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__843119857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-843119857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick__903608577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903608577L))
            info.cancel();
    }


}
