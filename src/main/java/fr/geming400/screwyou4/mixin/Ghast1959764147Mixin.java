package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.class)
public class Ghast1959764147Mixin {
        @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__333283826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333283826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo_1528833618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528833618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClimbable()Z", cancellable = true)
    private void onClimbable_1998042730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998042730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeashAsHolder()Z", cancellable = true)
    private void supportQuadLeashAsHolder_1998042730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998042730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1510333816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510333816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1967467150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967467150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCharging()Z", cancellable = true)
    private void isCharging_1998042730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998042730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1259545702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259545702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "faceMovementDirection(Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private static void faceMovementDirection__1831491256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1831491256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCharging(Z)V", cancellable = true)
    private void setCharging__1105586320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1105586320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExplosionPower()I", cancellable = true)
    private void getExplosionPower_1998026393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998026393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashSnapDistance()D", cancellable = true)
    private void leashSnapDistance_1998021588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998021588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpawnClusterSize()I", cancellable = true)
    private void getMaxSpawnClusterSize_1998026393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998026393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leashElasticDistance()D", cancellable = true)
    private void leashElasticDistance_1998021588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998021588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkGhastSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGhastSpawnRules_1117500453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117500453L))
            info.setReturnValue(null);
    }


}
