package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.InventoryScreen.class)
public class InventoryScreen33509530Mixin {
        @Inject(at = @At("HEAD"), method = "mouseReleased(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseReleased_617645490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617645490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1020389172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1020389172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showsActiveEffects()Z", cancellable = true)
    private void showsActiveEffects_161554539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161554539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1434964063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434964063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractEntityInInventoryFollowsMouse(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIIIIFFFLnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void extractEntityInInventoryFollowsMouse_628125069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(628125069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_1374475343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1374475343L))
            info.cancel();
    }


}
