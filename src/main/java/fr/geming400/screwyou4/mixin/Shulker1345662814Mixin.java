package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Shulker.class)
public class Shulker1345662814Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1282597249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282597249L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move__1403859233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1403859233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void push__1222215932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1222215932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1215979156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1215979156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Ljava/util/Optional;", cancellable = true)
    private void getVariant_780447835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780447835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPos(DDD)V", cancellable = true)
    private void setPos_726133527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(726133527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopRiding()V", cancellable = true)
    private void stopRiding__1522695654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522695654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_530374961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530374961L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1973653975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973653975L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.YELLOW);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1574202492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574202492L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1435047283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435047283L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MUSIC);
    }

    @Inject(at = @At("HEAD"), method = "setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setDeltaMovement_239792354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(239792354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDeltaMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getDeltaMovement_851187430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851187430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1954093190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954093190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation_1085914547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085914547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__1937643765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1937643765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_2052397162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052397162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_1447434725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447434725L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeCollidedWith(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void canBeCollidedWith_1595931533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595931533L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAttachFace()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getAttachFace__1774475231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774475231L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getClientPeekAmount(F)F", cancellable = true)
    private void getClientPeekAmount__473133013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473133013L))
            info.setReturnValue(7.245678E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRenderPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderPosition_679414818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679414818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgressAabb(FLnet/minecraft/core/Direction;FLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void getProgressAabb_336950345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336950345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadXRot()I", cancellable = true)
    private void getMaxHeadXRot__633403177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633403177L))
            info.setReturnValue(-1358832345);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1854109656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854109656L))
            info.setReturnValue(-1981895619);
    }

    @Inject(at = @At("HEAD"), method = "getProgressDeltaAabb(FLnet/minecraft/core/Direction;FFLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void getProgressDeltaAabb_363678243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363678243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playAmbientSound()V", cancellable = true)
    private void playAmbientSound_822358598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(822358598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2095761123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095761123L))
            info.setReturnValue(null);
    }


}
