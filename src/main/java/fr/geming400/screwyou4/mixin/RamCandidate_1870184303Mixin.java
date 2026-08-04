package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.PrepareRamNearestTarget.RamCandidate.class)
public class RamCandidate_1870184303Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1137946187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137946187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTargetPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTargetPosition__23202577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23202577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartPosition__23202577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23202577L))
            info.setReturnValue(null);
    }


}
