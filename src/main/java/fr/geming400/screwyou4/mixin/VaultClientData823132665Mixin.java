package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultClientData.class)
public class VaultClientData823132665Mixin {
        @Inject(at = @At("HEAD"), method = "previousSpin()F", cancellable = true)
    private void previousSpin_861392028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861392028L))
            info.setReturnValue(8.742484E8F);
    }

    @Inject(at = @At("HEAD"), method = "currentSpin()F", cancellable = true)
    private void currentSpin_861392028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861392028L))
            info.setReturnValue(8.742484E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateDisplayItemSpin()V", cancellable = true)
    private void updateDisplayItemSpin_861407404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(861407404L))
            info.cancel();
    }


}
