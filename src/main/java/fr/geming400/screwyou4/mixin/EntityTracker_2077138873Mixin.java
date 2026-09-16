package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.EntityTracker.class)
public class EntityTracker_2077138873Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1447405395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447405395L))
            info.setReturnValue("}^+q,Lt\u056DaL3P:f`}\uA333<pCr0!Yx>\uC6ABIt;ZF\u34C1p\u2C8BFAz<P_>X3Z#m6G\u6ADD_\uCB5BXzodmF\u253F");
    }

    @Inject(at = @At("HEAD"), method = "currentPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void currentPosition_831229103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831229103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentBlockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void currentBlockPosition__527449860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527449860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__880630203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880630203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisibleBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isVisibleBy_1744926782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744926782L))
            info.setReturnValue(true);
    }


}
