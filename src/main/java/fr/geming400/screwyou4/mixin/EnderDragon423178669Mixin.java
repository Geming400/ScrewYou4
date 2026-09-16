package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EnderDragon.class)
public class EnderDragon423178669Mixin {
        @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill_796884883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(796884883L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEffect(Lnet/minecraft/world/effect/MobEffectInstance;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addEffect_1446807033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446807033L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "knockback(DDDLnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void knockback__996460852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-996460852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__1129355713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129355713L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_2054476236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2054476236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__392109184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392109184L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource_1937435868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937435868L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.HOSTILE);
    }

    @Inject(at = @At("HEAD"), method = "canAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canAttack__1038381492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038381492L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/boss/enderdragon/EnderDragonPart;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurt__1743930141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743930141L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1798280659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798280659L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "checkDespawn()V", cancellable = true)
    private void checkDespawn__2131540434(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131540434L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1129913017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1129913017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal__436411375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436411375L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_1434839386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434839386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_313313363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313313363L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onFlap()V", cancellable = true)
    private void onFlap__901130516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-901130516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSubEntities()[Lnet/minecraft/world/entity/boss/enderdragon/EnderDragonPart;", cancellable = true)
    private void getSubEntities_689293072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689293072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDragonFight(Lnet/minecraft/world/level/dimension/end/EnderDragonFight;)V", cancellable = true)
    private void setDragonFight__22609690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-22609690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDragonFight()Lnet/minecraft/world/level/dimension/end/EnderDragonFight;", cancellable = true)
    private void getDragonFight_1460144148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460144148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPath(IILnet/minecraft/world/level/pathfinder/Node;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void findPath_425465423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425465423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void onCrystalDestroyed__975652531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-975652531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeadLookVector(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getHeadLookVector__900103468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900103468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestNode(DDD)I", cancellable = true)
    private void findClosestNode_1523970697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523970697L))
            info.setReturnValue(-583436626);
    }

    @Inject(at = @At("HEAD"), method = "findClosestNode()I", cancellable = true)
    private void findClosestNode__359966639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359966639L))
            info.setReturnValue(-548875311);
    }

    @Inject(at = @At("HEAD"), method = "getPhaseManager()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhaseManager;", cancellable = true)
    private void getPhaseManager__272988462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272988462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFightOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getFightOrigin__1203409650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203409650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFightOrigin(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setFightOrigin__977163576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-977163576L))
            info.cancel();
    }


}
