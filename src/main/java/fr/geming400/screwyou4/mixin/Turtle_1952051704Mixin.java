package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.turtle.Turtle.class)
public class Turtle_1952051704Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__711618026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-711618026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_1315835961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315835961L))
            info.setReturnValue(7.687232E8F);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__967813603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-967813603L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_3979589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3979589L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid__806077826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806077826L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1347704301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347704301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thunderHit(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LightningBolt;)V", cancellable = true)
    private void thunderHit_1050978903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050978903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove__2021021844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021021844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLayingEgg()Z", cancellable = true)
    private void isLayingEgg_309718129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309718129L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkTurtleSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkTurtleSpawnRules_330977193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330977193L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2091806843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091806843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_411065521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411065521L))
            info.setReturnValue(7.687232E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSoundInterval()I", cancellable = true)
    private void getAmbientSoundInterval_1772929899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772929899L))
            info.setReturnValue(-1690319333);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1927925291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927925291L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHomePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHomePos_512760473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512760473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEgg()Z", cancellable = true)
    private void hasEgg_372406147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372406147L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setHomePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHomePos__393510927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-393510927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1592817284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592817284L))
            info.setReturnValue(null);
    }


}
