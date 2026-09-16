package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinAi.class)
public class PiglinAi_439579887Mixin {
        @Inject(at = @At("HEAD"), method = "getActivities(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/List;", cancellable = true)
    private static void getActivities_1435861417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435861417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "angerNearbyPiglins(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;Z)V", cancellable = true)
    private static void angerNearbyPiglins_114696033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114696033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/monster/piglin/Piglin;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void mobInteract_1971144493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971144493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundForCurrentActivity(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/Optional;", cancellable = true)
    private static void getSoundForCurrentActivity__1067299748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067299748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlayerHoldingLovedItem(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isPlayerHoldingLovedItem__2011370438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011370438L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isZombified(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void isZombified_604330413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604330413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findNearbyAdultPiglins(Lnet/minecraft/world/entity/ai/Brain;)Ljava/util/List;", cancellable = true)
    private static void findNearbyAdultPiglins__2036805605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036805605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWearingSafeArmor(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isWearingSafeArmor_497973446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497973446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAvoidTarget(Lnet/minecraft/world/entity/monster/piglin/Piglin;)Ljava/util/Optional;", cancellable = true)
    private static void getAvoidTarget__350511692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350511692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearestVisibleTargetablePlayer(Lnet/minecraft/world/entity/monster/piglin/AbstractPiglin;)Ljava/util/Optional;", cancellable = true)
    private static void getNearestVisibleTargetablePlayer_1617177404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617177404L))
            info.setReturnValue(null);
    }


}
