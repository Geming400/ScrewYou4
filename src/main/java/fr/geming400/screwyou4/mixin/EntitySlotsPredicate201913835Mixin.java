package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntitySlotsPredicate.class)
public class EntitySlotsPredicate201913835Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1587426094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587426094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__933546140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933546140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_240176577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240176577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1752278076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752278076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/advancements/predicates/SlotsPredicate;", cancellable = true)
    private void slots__1574691924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574691924L))
            info.setReturnValue(null);
    }


}
