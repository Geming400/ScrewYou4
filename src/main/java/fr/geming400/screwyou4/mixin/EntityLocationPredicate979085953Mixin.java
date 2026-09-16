package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityLocationPredicate.class)
public class EntityLocationPredicate979085953Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_70459685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70459685L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1749509478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749509478L))
            info.setReturnValue("P\u2ED4n3a\u5E9E[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1536438044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536438044L))
            info.setReturnValue(-475218983);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1965572409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965572409L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate_1016926999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016926999L))
            info.setReturnValue(null);
    }


}
