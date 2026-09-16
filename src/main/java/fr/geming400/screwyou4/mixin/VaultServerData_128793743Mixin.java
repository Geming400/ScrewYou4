package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultServerData.class)
public class VaultServerData_128793743Mixin {
        @Inject(at = @At("HEAD"), method = "ejectionProgress()F", cancellable = true)
    private void ejectionProgress__2115127091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115127091L))
            info.setReturnValue(2.505558E8F);
    }

    @Inject(at = @At("HEAD"), method = "addToRewardedPlayers(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void addToRewardedPlayers__826731116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-826731116L))
            info.cancel();
    }


}
