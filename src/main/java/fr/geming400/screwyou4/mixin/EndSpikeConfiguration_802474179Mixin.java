package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.EndSpikeConfiguration.class)
public class EndSpikeConfiguration_802474179Mixin {
        @Inject(at = @At("HEAD"), method = "isCrystalInvulnerable()Z", cancellable = true)
    private void isCrystalInvulnerable_840752761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840752761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCrystalBeamTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCrystalBeamTarget__1090912701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090912701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpikes()Ljava/util/List;", cancellable = true)
    private void getSpikes__1866156302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866156302L))
            info.setReturnValue(null);
    }


}
