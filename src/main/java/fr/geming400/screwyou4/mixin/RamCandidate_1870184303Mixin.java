package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.PrepareRamNearestTarget.RamCandidate.class)
public class RamCandidate_1870184303Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1833584932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833584932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartPosition__1234564198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234564198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTargetPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTargetPosition__2102168545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102168545L))
            info.setReturnValue(null);
    }


}
