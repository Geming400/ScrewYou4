package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.WalkTarget.class)
public class WalkTarget_298339308Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/ai/behavior/PositionTracker;", cancellable = true)
    private void getTarget__1030612773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030612773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpeedModifier()F", cancellable = true)
    private void getSpeedModifier_336598670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336598670L))
            info.setReturnValue(7.869233E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCloseEnoughDist()I", cancellable = true)
    private void getCloseEnoughDist_336601553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336601553L))
            info.setReturnValue(-1566101113);
    }


}
