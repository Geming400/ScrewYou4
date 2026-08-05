package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BehaviorUtils.class)
public class BehaviorUtils1152006513Mixin {
        @Inject(at = @At("HEAD"), method = "getNearestTarget(Lnet/minecraft/world/entity/LivingEntity;Ljava/util/Optional;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getNearestTarget__476149769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476149769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lockGazeAndWalkToEachOther(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;FI)V", cancellable = true)
    private static void lockGazeAndWalkToEachOther_19008607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(19008607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityIsVisible(Lnet/minecraft/world/entity/ai/Brain;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void entityIsVisible_1527549571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527549571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "targetIsValid(Lnet/minecraft/world/entity/ai/Brain;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void targetIsValid__1379263938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379263938L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTargetNearestMe(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private static void getTargetNearestMe__910303754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910303754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSwimmablePos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getRandomSwimmablePos_1192499543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192499543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOtherTargetMuchFurtherAwayThanCurrentAttackTarget(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;D)Z", cancellable = true)
    private static void isOtherTargetMuchFurtherAwayThanCurrentAttackTarget__1519667948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519667948L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "findSectionClosestToVillage(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/SectionPos;I)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void findSectionClosestToVillage_2056205728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056205728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinAttackRange(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private static void isWithinAttackRange__1263298477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263298477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSee(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canSee_1203639840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203639840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "throwItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;F)V", cancellable = true)
    private static void throwItem__722616035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-722616035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void throwItem_1631236019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1631236019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLivingEntityFromUUIDMemory(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private static void getLivingEntityFromUUIDMemory_836867577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836867577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/ai/behavior/PositionTracker;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories__862280896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-862280896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories_1159146312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159146312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWalkAndLookTargetMemories(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/BlockPos;FI)V", cancellable = true)
    private static void setWalkAndLookTargetMemories__1794685309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794685309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBreeding(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isBreeding_1473673936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473673936L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lookAtEntity(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void lookAtEntity_1203635996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1203635996L))
            info.cancel();
    }


}
