package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.class)
public class Fox_486666847Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__2141593217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141593217L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_629072660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629072660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_356983188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(356983188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private void getVariant_283897947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283897947L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "isSleeping()Z", cancellable = true)
    private void isSleeping_126340160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126340160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_2117964413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2117964413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1240414962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240414962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Z", cancellable = true)
    private void isCrouching_1910485239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910485239L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1861768836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861768836L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1481878138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481878138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsInterested(Z)V", cancellable = true)
    private void setIsInterested_187023600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(187023600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFaceplanted()Z", cancellable = true)
    private void isFaceplanted_920428082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920428082L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setIsCrouching(Z)V", cancellable = true)
    private void setIsCrouching__1791594441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791594441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterested()Z", cancellable = true)
    private void isInterested_937512418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937512418L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setIsPouncing(Z)V", cancellable = true)
    private void setIsPouncing_1190509982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1190509982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFullyCrouched()Z", cancellable = true)
    private void isFullyCrouched_389388028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389388028L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCrouchAmount(F)F", cancellable = true)
    private void getCrouchAmount_701655583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701655583L))
            info.setReturnValue(4.763929E8F);
    }

    @Inject(at = @At("HEAD"), method = "isPathClear(Lnet/minecraft/world/entity/animal/fox/Fox;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isPathClear__1857591745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857591745L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRollAngle(F)F", cancellable = true)
    private void getHeadRollAngle_975689623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975689623L))
            info.setReturnValue(4.763929E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkFoxSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkFoxSpawnRules_1738822125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738822125L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_626550946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626550946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/fox/Fox;", cancellable = true)
    private void getBreedOffspring_459482861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459482861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem__1586581480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586581480L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_2026849789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026849789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_1591290131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591290131L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_462540434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462540434L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1236765155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236765155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound__36637370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-36637370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSitting(Z)V", cancellable = true)
    private void setSitting__409455707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-409455707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPouncing()Z", cancellable = true)
    private void isPouncing__1334170636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334170636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canMove()Z", cancellable = true)
    private void canMove_753135860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753135860L))
            info.setReturnValue(false);
    }


}
