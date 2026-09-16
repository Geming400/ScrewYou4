package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.WalkTarget.class)
public class WalkTarget_298339308Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/ai/behavior/PositionTracker;", cancellable = true)
    private void getTarget__1300672286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300672286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpeedModifier()F", cancellable = true)
    private void getSpeedModifier_719896326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719896326L))
            info.setReturnValue(1.952441E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCloseEnoughDist()I", cancellable = true)
    private void getCloseEnoughDist_1889634233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889634233L))
            info.setReturnValue(-604506997);
    }


}
