package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityPredicate.class)
public class EntityPredicate_1858715530Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_950088765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950088765L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1665828738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665828738L))
            info.setReturnValue("I\u8CF8[=m:JGJIohGRCq\u6003&=0\u0475#L+erG*h,\u2F9Dae\u2F9Bvb7\u88C5(:#m.jCs\u621BUxVC]Gte");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1878900172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878900172L))
            info.setReturnValue(-199188053);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/ContextAwarePredicate;", cancellable = true)
    private static void wrap__471260925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471260925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lnet/minecraft/advancements/predicates/entity/EntityPredicate;)Lnet/minecraft/advancements/predicates/ContextAwarePredicate;", cancellable = true)
    private static void wrap__659647494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659647494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap([Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Ljava/util/List;", cancellable = true)
    private static void wrap_1059727351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059727351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrap(Ljava/util/Optional;)Ljava/util/Optional;", cancellable = true)
    private static void wrap_54279146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54279146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__1343259146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343259146L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches_1125701515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125701515L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createContext(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/level/storage/loot/LootContext;", cancellable = true)
    private static void createContext__1860680887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860680887L))
            info.setReturnValue(null);
    }


}
