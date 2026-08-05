package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinAi.class)
public class PiglinAi_439579887Mixin {
        @Inject(at = @At("HEAD"), method = "getSoundForCurrentActivity(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/Optional;", cancellable = true)
    private static void getSoundForCurrentActivity_1516758916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516758916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvoidTarget(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/Optional;", cancellable = true)
    private static void getAvoidTarget_1516758916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516758916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWearingSafeArmor(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isWearingSafeArmor_761247309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761247309L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPlayerHoldingLovedItem(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isPlayerHoldingLovedItem_761247309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761247309L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findNearbyAdultPiglins(Lnet/minecraft/world/entity/ai/Brain;)Ljava/util/List;", cancellable = true)
    private static void findNearbyAdultPiglins_1271214473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271214473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isZombified(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void isZombified__12140682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-12140682L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getActivities(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/List;", cancellable = true)
    private static void getActivities_1251204102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251204102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "angerNearbyPiglins(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;Z)V", cancellable = true)
    private static void angerNearbyPiglins_283350807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(283350807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/monster/piglin/Piglin;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void mobInteract_40484055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40484055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearestVisibleTargetablePlayer(Lnet/minecraft/world/entity/monster/piglin/AbstractPiglin;)Ljava/util/Optional;", cancellable = true)
    private static void getNearestVisibleTargetablePlayer__2026841018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026841018L))
            info.setReturnValue(null);
    }


}
