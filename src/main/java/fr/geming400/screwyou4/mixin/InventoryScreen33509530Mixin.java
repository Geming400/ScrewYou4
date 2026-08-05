package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.InventoryScreen.class)
public class InventoryScreen33509530Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__926177842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-926177842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_71784269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71784269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_257131824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257131824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__926177842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-926177842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsActiveEffects()Z", cancellable = true)
    private void showsActiveEffects_71788113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71788113L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractEntityInInventoryFollowsMouse(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIIFFFLnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void extractEntityInInventoryFollowsMouse__978243165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-978243165L))
            info.cancel();
    }


}
