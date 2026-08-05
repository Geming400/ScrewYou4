package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPredicate.class)
public class EntityPredicate_1858715530Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1050740004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050740004L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_723255058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723255058L))
            info.setReturnValue("=>㻁yB?Va9Ak\"Lᴑ|E]h7EZT+N:F+O=?Y;(+i -N侧ivrhl9떗聼jNKoBJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1896977775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896977775L))
            info.setReturnValue(-2009120443);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/ContextAwarePredicate;", cancellable = true)
    private static void wrap__990816115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990816115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/advancements/predicates/ContextAwarePredicate;", cancellable = true)
    private static void wrap__1010567804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010567804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap([Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Ljava/util/List;", cancellable = true)
    private static void wrap_1545504385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545504385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Ljava/util/Optional;)Ljava/util/Optional;", cancellable = true)
    private static void wrap__385600864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385600864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__215301431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215301431L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_2116167966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116167966L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createContext(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void createContext_1410259894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410259894L))
            info.setReturnValue(null);
    }


}
