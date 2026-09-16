package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.GolemSensor.class)
public class GolemSensor1185024280Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__59910964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59910964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "golemDetected(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void golemDetected_514301377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(514301377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkForNearbyGolem(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void checkForNearbyGolem__648165889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648165889L))
            info.cancel();
    }


}
