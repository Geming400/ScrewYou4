package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.WorldBorder.class)
public class WorldBorder52700976Mixin {
        @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSize(D)V", cancellable = true)
    private void setSize_1262000343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262000343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_90975715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(90975715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private void getStatus_2122226095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122226095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeListener(Lnet/minecraft/world/level/border/BorderChangeListener;)V", cancellable = true)
    private void removeListener__216647005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-216647005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/world/level/border/BorderChangeListener;)V", cancellable = true)
    private void addListener__216647005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-216647005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMinZ(F)D", cancellable = true)
    private void getMinZ_1263830087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263830087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinZ()D", cancellable = true)
    private void getMinZ_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxZ()D", cancellable = true)
    private void getMaxZ_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxZ(F)D", cancellable = true)
    private void getMaxZ_1263830087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263830087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinX()D", cancellable = true)
    private void getMinX_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinX(F)D", cancellable = true)
    private void getMinX_1263830087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263830087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxX(F)D", cancellable = true)
    private void getMaxX_1263830087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263830087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxX()D", cancellable = true)
    private void getMaxX_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWarningTime(I)V", cancellable = true)
    private void setWarningTime_1266617948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1266617948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lerpSizeBetween(DDJJ)V", cancellable = true)
    private void lerpSizeBetween_1429924771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1429924771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWarningBlocks(I)V", cancellable = true)
    private void setWarningBlocks_1266617948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1266617948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAbsoluteMaxSize(I)V", cancellable = true)
    private void setAbsoluteMaxSize_1266617948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1266617948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_90964183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90964183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampVec3ToBound(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampVec3ToBound__762394979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762394979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampVec3ToBound(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampVec3ToBound_1742356021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742356021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterX()D", cancellable = true)
    private void getCenterX_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterZ()D", cancellable = true)
    private void getCenterZ_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCenter(DD)V", cancellable = true)
    private void setCenter__1090941853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1090941853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteMaxSize()I", cancellable = true)
    private void getAbsoluteMaxSize_90963222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90963222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__1828968942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828968942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInsideCloseToBorder(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isInsideCloseToBorder_757571449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757571449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_90963222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90963222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWarningTime()I", cancellable = true)
    private void getWarningTime_90963222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90963222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLerpSpeed()D", cancellable = true)
    private void getLerpSpeed_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLerpTarget()D", cancellable = true)
    private void getLerpTarget_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isWithinBounds_221471419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221471419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isWithinBounds__1682764174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682764174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void isWithinBounds_1567587027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567587027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void isWithinBounds_420440819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420440819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(DD)Z", cancellable = true)
    private void isWithinBounds__1090938009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090938009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(DDD)Z", cancellable = true)
    private void isWithinBounds__1017702053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1017702053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSafeZone()D", cancellable = true)
    private void getSafeZone_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDistanceToBorder(Lnet/minecraft/world/entity/Entity;)D", cancellable = true)
    private void getDistanceToBorder__399040982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399040982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDistanceToBorder(DD)D", cancellable = true)
    private void getDistanceToBorder__1090959151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090959151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDamagePerBlock()D", cancellable = true)
    private void getDamagePerBlock_90958417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90958417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyInitialSettings(J)V", cancellable = true)
    private void applyInitialSettings_1267541469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1267541469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds_2076195973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076195973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(DDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds_231064357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231064357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds__298172227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298172227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSafeZone(D)V", cancellable = true)
    private void setSafeZone_1262000343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262000343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDamagePerBlock(D)V", cancellable = true)
    private void setDamagePerBlock_1262000343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1262000343L))
            info.cancel();
    }


}
