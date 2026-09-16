package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultClientData.class)
public class VaultClientData823132665Mixin {
        @Inject(at = @At("HEAD"), method = "currentSpin()F", cancellable = true)
    private void currentSpin__224516063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224516063L))
            info.setReturnValue(2.595823E8F);
    }

    @Inject(at = @At("HEAD"), method = "previousSpin()F", cancellable = true)
    private void previousSpin_1720219747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720219747L))
            info.setReturnValue(2.595823E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateDisplayItemSpin()V", cancellable = true)
    private void updateDisplayItemSpin_9528478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(9528478L))
            info.cancel();
    }


}
