package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.MobSensor.class)
public class MobSensor_1422224148Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__406811339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406811339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobDetected(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void mobDetected_1743887478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743887478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearMemory(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void clearMemory_1743887478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743887478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkForMobsNearby(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void checkForMobsNearby_1743887478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743887478L))
            info.cancel();
    }


}
