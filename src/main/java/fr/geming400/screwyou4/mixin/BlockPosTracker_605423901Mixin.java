package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BlockPosTracker.class)
public class BlockPosTracker_605423901Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1375846929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375846929L))
            info.setReturnValue("\uB46A}\u34AE|mgh9:59m9Zi85;\u42DF!9O9'f<ejH#X\u180F|NtWvXa");
    }

    @Inject(at = @At("HEAD"), method = "currentPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void currentPosition__640485869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640485869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentBlockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void currentBlockPosition__1999164832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999164832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisibleBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isVisibleBy_273211810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273211810L))
            info.setReturnValue(false);
    }


}
