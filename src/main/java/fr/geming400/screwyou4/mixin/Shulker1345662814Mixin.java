package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Shulker.class)
public class Shulker1345662814Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1182570409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182570409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move__757830578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-757830578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void push_893938154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(893938154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1383937553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383937553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Ljava/util/Optional;", cancellable = true)
    private void getVariant_1591124236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591124236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1513996252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513996252L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.YELLOW);
    }

    @Inject(at = @At("HEAD"), method = "stopRiding()V", cancellable = true)
    private void stopRiding_1383937553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383937553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPos(DDD)V", cancellable = true)
    private void setPos_275255941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(275255941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_896232483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896232483L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDeltaMovement__1851574953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851574953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation__2092868895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092868895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding__1885804562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885804562L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeCollidedWith(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canBeCollidedWith_893941998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893941998L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_156874124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(156874124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1303555038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1303555038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_645444369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645444369L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_103016770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103016770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setDeltaMovement_1713398813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713398813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__947385159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947385159L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MASTER);
    }

    @Inject(at = @At("HEAD"), method = "getProgressDeltaAabb(FLnet/minecraft/core/Direction;FFLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void getProgressDeltaAabb__288274920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288274920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1100572544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100572544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_1383937553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383937553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot_1383925060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383925060L))
            info.setReturnValue(-1545160364);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1383925060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383925060L))
            info.setReturnValue(-1545160364);
    }

    @Inject(at = @At("HEAD"), method = "getProgressAabb(FLnet/minecraft/core/Direction;FLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void getProgressAabb__587007386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587007386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClientPeekAmount(F)F", cancellable = true)
    private void getClientPeekAmount__1738173449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738173449L))
            info.setReturnValue(4.691613E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRenderPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderPosition__924156723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924156723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttachFace()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getAttachFace_582807529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582807529L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }


}
