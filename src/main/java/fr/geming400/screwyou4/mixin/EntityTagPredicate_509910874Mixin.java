package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityTagPredicate.class)
public class EntityTagPredicate_509910874Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__398715395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398715395L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1280334398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280334398L))
            info.setReturnValue("p+o-*8@OJds`!at{;\u2086e/s<}l=]9Q@++\u4010\u2AF2d7$C?7\uB61Dz\uF939ytJ;d &iy\uAAF0*\u5DE7C\u46C1kr\u3A88!Jsh\u1992\u2CF951va%T`E\u1DC2wa\u67F3w5,!z9.4\uCF1A0\u25FE8*iR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1067262964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067262964L))
            info.setReturnValue(-983800424);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1860219807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860219807L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Set;)Z", cancellable = true)
    private void matches_1391434936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391434936L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "noneOf()Ljava/util/Optional;", cancellable = true)
    private void noneOf__1258815690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258815690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf()Ljava/util/Optional;", cancellable = true)
    private void allOf__671274913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671274913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf()Ljava/util/Optional;", cancellable = true)
    private void anyOf__1564667670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564667670L))
            info.setReturnValue(null);
    }


}
