package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityTypePredicate.class)
public class EntityTypePredicate383482716Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1768994975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768994975L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__751977259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751977259L))
            info.setReturnValue("F0 Qcr(#ut%hB䱽4M&C?Vc)v=ꓞP,`]IjKdtkl!e쥑Gh2傭? X\"XS-!gF껱$䩛Da[)㚑Vj;}Xz9z?ee_띢N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_421745458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421745458L))
            info.setReturnValue(1088820391);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;", cancellable = true)
    private static void of_2060199133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060199133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/advancements/predicates/entity/EntityTypePredicate;", cancellable = true)
    private static void of__1627668178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627668178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches_1929961698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929961698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1570709195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570709195L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "types()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void types_2003435760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003435760L))
            info.setReturnValue(null);
    }


}
