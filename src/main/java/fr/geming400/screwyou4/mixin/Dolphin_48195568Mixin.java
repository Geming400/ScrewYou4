package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.dolphin.Dolphin.class)
public class Dolphin_48195568Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_86470306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(86470306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gotFish()Z", cancellable = true)
    private void gotFish_86474150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86474150L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setGotFish(Z)V", cancellable = true)
    private void setGotFish_1277812396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1277812396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_369862742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369862742L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMoistnessLevel()I", cancellable = true)
    private void getMoistnessLevel_86457813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86457813L))
            info.setReturnValue(407125759);
    }

    @Inject(at = @At("HEAD"), method = "setMoisntessLevel(I)V", cancellable = true)
    private void setMoisntessLevel_1262112539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262112539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1896927505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896927505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_86470306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(86470306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_86474150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86474150L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1255647892(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1255647892L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__652022878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652022878L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1194450477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194450477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_86454930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86454930L))
            info.setReturnValue(5.240515E8F);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply_86457813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86457813L))
            info.setReturnValue(407125759);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_86457813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86457813L))
            info.setReturnValue(407125759);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot_86457813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86457813L))
            info.setReturnValue(407125759);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/dolphin/Dolphin;", cancellable = true)
    private void getBreedOffspring_184088578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184088578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1645984149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645984149L))
            info.setReturnValue(null);
    }


}
