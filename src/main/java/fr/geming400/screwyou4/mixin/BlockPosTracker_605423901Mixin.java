package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BlockPosTracker.class)
public class BlockPosTracker_605423901Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__530036571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530036571L))
            info.setReturnValue("?脵(筴E脭GX2.\".죜;x}hF5lBx");
    }

    @Inject(at = @At("HEAD"), method = "currentPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void currentPosition_1703153429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703153429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisibleBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isVisibleBy_927091075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927091075L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "currentBlockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void currentBlockPosition__1287962979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287962979L))
            info.setReturnValue(null);
    }


}
