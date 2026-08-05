package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.EffectsInInventory.class)
public class EffectsInInventory_724680031Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_1939853862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1939853862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSeeEffects()Z", cancellable = true)
    private void canSeeEffects_762958613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762958613L))
            info.setReturnValue(false);
    }


}
