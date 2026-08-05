package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.GolemSensor.class)
public class GolemSensor1185024280Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__644011206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644011206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkForNearbyGolem(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void checkForNearbyGolem_1506687859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506687859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "golemDetected(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void golemDetected_1506687859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506687859L))
            info.cancel();
    }


}
