package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.polarbear.PolarBear.class)
public class PolarBear48954116Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_87228855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87228855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1897686054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897686054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__651264329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651264329L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1193691928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193691928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkPolarBearSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkPolarBearSpawnRules__793309578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793309578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStandingAnimationScale(F)F", cancellable = true)
    private void getStandingAnimationScale_1260085149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260085149L))
            info.setReturnValue(1.882552E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_87217323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87217323L))
            info.setReturnValue(-6573916521612099988L);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_87228855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87228855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget_1438530937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438530937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime_1263794609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1263794609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget_911915781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911915781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1646613738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646613738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1783489248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783489248L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStanding()Z", cancellable = true)
    private void isStanding_87232699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87232699L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setStanding(Z)V", cancellable = true)
    private void setStanding_1278570945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278570945L))
            info.cancel();
    }


}
