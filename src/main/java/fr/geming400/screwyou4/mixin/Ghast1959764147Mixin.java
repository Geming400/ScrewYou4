package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.class)
public class Ghast1959764147Mixin {
        @Inject(at = @At("HEAD"), method = "supportQuadLeashAsHolder()Z", cancellable = true)
    private void supportQuadLeashAsHolder__436834907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436834907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo_211315876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211315876L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable__1629026822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629026822L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__960101159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960101159L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1144476294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144476294L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__585543796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-585543796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__820945950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820945950L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MASTER);
    }

    @Inject(at = @At("HEAD"), method = "leashSnapDistance()D", cancellable = true)
    private void leashSnapDistance_749115512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749115512L))
            info.setReturnValue(7.424975007759175E8D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1712077419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712077419L))
            info.setReturnValue(218194895);
    }

    @Inject(at = @At("HEAD"), method = "leashElasticDistance()D", cancellable = true)
    private void leashElasticDistance__1379386841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379386841L))
            info.setReturnValue(7.424975004200957E8D);
    }

    @Inject(at = @At("HEAD"), method = "setCharging(Z)V", cancellable = true)
    private void setCharging__271559133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-271559133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExplosionPower()I", cancellable = true)
    private void getExplosionPower__1473012109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473012109L))
            info.setReturnValue(-378159211);
    }

    @Inject(at = @At("HEAD"), method = "checkGhastSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGhastSpawnRules__298350128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298350128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "faceMovementDirection(Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private static void faceMovementDirection__1698651531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1698651531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCharging()Z", cancellable = true)
    private void isCharging_907970959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907970959L))
            info.setReturnValue(false);
    }


}
