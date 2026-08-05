package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fox.Fox.class)
public class Fox_486666847Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_323574441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323574441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_808330177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(808330177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_524941585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524941585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/fox/Fox$Variant;", cancellable = true)
    private void getVariant_2075666826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075666826L))
            info.setReturnValue(net.minecraft.world.entity.animal.fox.Fox.Variant.RED);
    }

    @Inject(at = @At("HEAD"), method = "setIsCrouching(Z)V", cancellable = true)
    private void setIsCrouching_1716283675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1716283675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIsInterested(Z)V", cancellable = true)
    private void setIsInterested_1716283675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1716283675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCrouchAmount(F)F", cancellable = true)
    private void getCrouchAmount_1697797879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697797879L))
            info.setReturnValue(5.87133E7F);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRollAngle(F)F", cancellable = true)
    private void getHeadRollAngle_1697797879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697797879L))
            info.setReturnValue(5.87133E7F);
    }

    @Inject(at = @At("HEAD"), method = "checkFoxSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkFoxSpawnRules__355596848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355596848L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setIsPouncing(Z)V", cancellable = true)
    private void setIsPouncing_1716283675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1716283675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFullyCrouched()Z", cancellable = true)
    private void isFullyCrouched_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInterested()Z", cancellable = true)
    private void isInterested_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPathClear(Lnet/minecraft/world/entity/animal/fox/Fox;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void isPathClear__1171534947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171534947L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFaceplanted()Z", cancellable = true)
    private void isFaceplanted_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Z", cancellable = true)
    private void isCrouching_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1694119171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1694119171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__213551599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213551599L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__755979198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755979198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem__2073765318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073765318L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/fox/Fox;", cancellable = true)
    private void getBreedOffspring__1958182577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958182577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2084455428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084455428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSleeping()Z", cancellable = true)
    private void isSleeping_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_524941585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524941585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset_1584396375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584396375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__2073765318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073765318L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSitting(Z)V", cancellable = true)
    private void setSitting_1716283675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1716283675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPouncing()Z", cancellable = true)
    private void isPouncing_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMove()Z", cancellable = true)
    private void canMove_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_524945429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524945429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1959568512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959568512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_524941585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524941585L))
            info.cancel();
    }


}
