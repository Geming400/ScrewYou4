package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ItemBasedSteering.class)
public class ItemBasedSteering205240739Mixin {
        @Inject(at = @At("HEAD"), method = "tickBoost()V", cancellable = true)
    private void tickBoost_243515478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(243515478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSynced()V", cancellable = true)
    private void onSynced_243515478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(243515478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "boost(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void boost__1501770502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501770502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "boostFactor()F", cancellable = true)
    private void boostFactor_243500102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243500102L))
            info.setReturnValue(1.611938E8F);
    }


}
