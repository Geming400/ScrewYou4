package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ItemBasedSteering.class)
public class ItemBasedSteering205240739Mixin {
        @Inject(at = @At("HEAD"), method = "boost(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void boost__826204579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826204579L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickBoost()V", cancellable = true)
    private void tickBoost_1218902032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1218902032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSynced()V", cancellable = true)
    private void onSynced__277145411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-277145411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "boostFactor()F", cancellable = true)
    private void boostFactor_1346041012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346041012L))
            info.setReturnValue(7.803269E8F);
    }


}
