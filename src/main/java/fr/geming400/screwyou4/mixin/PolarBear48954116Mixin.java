package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.polarbear.PolarBear.class)
public class PolarBear48954116Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__80729542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-80729542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1424056106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424056106L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1044165408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044165408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStanding(Z)V", cancellable = true)
    private void setStanding__1719830001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1719830001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_188709256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188709256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget_821640506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(821640506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime__1576282627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576282627L))
            info.setReturnValue(-5798015617217600347L);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer__1326044384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1326044384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime_1149535659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149535659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__1370504016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370504016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkPolarBearSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkPolarBearSpawnRules_1157824880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157824880L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStandingAnimationScale(F)F", cancellable = true)
    private void getStandingAnimationScale_1312420901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312420901L))
            info.setReturnValue(4.991528E8F);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_24827704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24827704L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_799052425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799052425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStanding()Z", cancellable = true)
    private void isStanding_2060122853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060122853L))
            info.setReturnValue(false);
    }


}
