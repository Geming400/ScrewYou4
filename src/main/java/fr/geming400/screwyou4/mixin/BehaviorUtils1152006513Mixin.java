package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BehaviorUtils.class)
public class BehaviorUtils1152006513Mixin {
        @Inject(at = @At("HEAD"), method = "isWithinAttackRange(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private static void isWithinAttackRange_1748727283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748727283L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSwimmablePos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getRandomSwimmablePos__1807254231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807254231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOtherTargetMuchFurtherAwayThanCurrentAttackTarget(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;D)Z", cancellable = true)
    private static void isOtherTargetMuchFurtherAwayThanCurrentAttackTarget_695403575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695403575L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "findSectionClosestToVillage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/SectionPos;I)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void findSectionClosestToVillage__2020081476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020081476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookAtEntity(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void lookAtEntity__623915577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-623915577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;F)V", cancellable = true)
    private static void throwItem__1161489628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1161489628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void throwItem__161227334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-161227334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSee(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canSee__839009187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839009187L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/ai/behavior/PositionTracker;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories_592327803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(592327803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories__1400629720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1400629720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories_299952941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(299952941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLivingEntityFromUUIDMemory(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private static void getLivingEntityFromUUIDMemory_468467905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468467905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBreeding(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isBreeding_310254088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310254088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lockGazeAndWalkToEachOther(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;FI)V", cancellable = true)
    private static void lockGazeAndWalkToEachOther__1847906693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1847906693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityIsVisible(Lnet/minecraft/world/entity/ai/Brain;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void entityIsVisible__1277035746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277035746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNearestTarget(Lnet/minecraft/world/entity/LivingEntity;Ljava/util/Optional;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getNearestTarget_1544020862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544020862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTargetNearestMe(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getTargetNearestMe__841350971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841350971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetIsValid(Lnet/minecraft/world/entity/ai/Brain;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void targetIsValid_969148255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969148255L))
            info.setReturnValue(false);
    }


}
