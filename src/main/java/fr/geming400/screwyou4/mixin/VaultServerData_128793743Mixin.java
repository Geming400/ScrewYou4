package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultServerData.class)
public class VaultServerData_128793743Mixin {
        @Inject(at = @At("HEAD"), method = "addToRewardedPlayers(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void addToRewardedPlayers_1069395388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1069395388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ejectionProgress()F", cancellable = true)
    private void ejectionProgress_167053105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167053105L))
            info.setReturnValue(null);
    }


}
