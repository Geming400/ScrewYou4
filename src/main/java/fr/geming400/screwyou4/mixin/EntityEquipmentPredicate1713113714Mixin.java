package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEquipmentPredicate.class)
public class EntityEquipmentPredicate1713113714Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1196341323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1196341323L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_577653739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577653739L))
            info.setReturnValue("2wޠ岛M?36 c@xou9DZ\"zIwFMAT6S<IᅧUl?6xg;Ng`nz(>cgxXy2ZJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1751376456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751376456L))
            info.setReturnValue(-1014787894);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_1261392898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261392898L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__241078197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241078197L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "head()Ljava/util/Optional;", cancellable = true)
    private void head_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/Optional;", cancellable = true)
    private void body_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "captainPredicate(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/advancements/predicates/entity/EntityEquipmentPredicate;", cancellable = true)
    private static void captainPredicate_1908347937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908347937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chest()Ljava/util/Optional;", cancellable = true)
    private void chest_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offhand()Ljava/util/Optional;", cancellable = true)
    private void offhand_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "feet()Ljava/util/Optional;", cancellable = true)
    private void feet_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainhand()Ljava/util/Optional;", cancellable = true)
    private void mainhand_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "legs()Ljava/util/Optional;", cancellable = true)
    private void legs_1958575136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958575136L))
            info.setReturnValue(null);
    }


}
