package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EnderDragon.class)
public class EnderDragon423178669Mixin {
        @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill__555230671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555230671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1869869304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869869304L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.RECORDS);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__26251662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26251662L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSubEntities()[Lnet/minecraft/world/entity/boss/enderdragon/EnderDragonPart;", cancellable = true)
    private void getSubEntities_1718664421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718664421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDragonFight(Lnet/minecraft/world/level/dimension/end/EnderDragonFight;)V", cancellable = true)
    private void setDragonFight__536961983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536961983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDragonFight()Lnet/minecraft/world/level/dimension/end/EnderDragonFight;", cancellable = true)
    private void getDragonFight_201864653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201864653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal_1652799342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652799342L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn_461453408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461453408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_2068928113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2068928113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__765610021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-765610021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__277039776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277039776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void knockback_1114941457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114941457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/boss/enderdragon/EnderDragonPart;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurt_1511499156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511499156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_461457252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461457252L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onFlap()V", cancellable = true)
    private void onFlap_461453408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461453408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_461457252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461457252L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_461453408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461453408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addEffect_583863783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583863783L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack_744845844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744845844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFightOrigin(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setFightOrigin_591945268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591945268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhaseManager()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhaseManager;", cancellable = true)
    private void getPhaseManager_302479018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302479018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadLookVector(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getHeadLookVector__1846640868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846640868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestNode(DDD)I", cancellable = true)
    private void findClosestNode__647240697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647240697L))
            info.setReturnValue(-1012952213);
    }

    @Inject(at = @At("HEAD"), method = "findClosestNode()I", cancellable = true)
    private void findClosestNode_461440915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461440915L))
            info.setReturnValue(-103198713);
    }

    @Inject(at = @At("HEAD"), method = "getFightOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getFightOrigin__1470208210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470208210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void onCrystalDestroyed__512294769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-512294769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findPath(IILnet/minecraft/world/level/pathfinder/Node;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void findPath__517880367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517880367L))
            info.setReturnValue(null);
    }


}
