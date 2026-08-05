package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.EnchantmentScreen.class)
public class EnchantmentScreen_2050392907Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1090705534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1090705534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1090705534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1090705534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickBook()V", cancellable = true)
    private void tickBook_2088667645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2088667645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_435734028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435734028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_2088667645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2088667645L))
            info.cancel();
    }


}
