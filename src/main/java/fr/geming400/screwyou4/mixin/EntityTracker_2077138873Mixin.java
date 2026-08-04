package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.EntityTracker.class)
public class EntityTracker_2077138873Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_941678401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941678401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void currentPosition__1120098895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120098895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__388939970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388939970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisibleBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isVisibleBy__1896161249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896161249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentBlockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void currentBlockPosition_183751993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183751993L))
            info.setReturnValue(null);
    }


}
