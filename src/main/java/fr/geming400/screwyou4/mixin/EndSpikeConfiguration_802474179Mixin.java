package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.EndSpikeConfiguration.class)
public class EndSpikeConfiguration_802474179Mixin {
        @Inject(at = @At("HEAD"), method = "getSpikes()Ljava/util/List;", cancellable = true)
    private void getSpikes__1265869931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265869931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCrystalBeamTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCrystalBeamTarget_1210718467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210718467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCrystalInvulnerable()Z", cancellable = true)
    private void isCrystalInvulnerable_1502636832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502636832L))
            info.setReturnValue(true);
    }


}
