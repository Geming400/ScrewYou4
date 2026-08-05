package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.turtle.Turtle.class)
public class Turtle_1952051704Mixin {
        @Inject(at = @At("HEAD"), method = "checkTurtleSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkTurtleSpawnRules_1109788009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109788009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isLayingEgg()Z", cancellable = true)
    private void isLayingEgg_1990330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990330286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1990330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990330286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_1022031686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1022031686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1990326442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1990326442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__494183655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494183655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid_1990330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990330286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_1990330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990330286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1251833258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251833258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_709405659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709405659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1990311066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990311066L))
            info.setReturnValue(7.493788E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1990313949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990313949L))
            info.setReturnValue(-150323125);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__745255971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745255971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__2128604622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128604622L))
            info.setReturnValue(7.493788E8F);
    }

    @Inject(at = @At("HEAD"), method = "setHomePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHomePos_2120818302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120818302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasEgg()Z", cancellable = true)
    private void hasEgg_1990330286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990330286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__608380461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608380461L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHomePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHomePos_58664824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58664824L))
            info.setReturnValue(null);
    }


}
