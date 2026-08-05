package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.WorldBorder.class)
public class WorldBorder52700976Mixin {
        @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize_486822970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486822970L))
            info.setReturnValue(6.679280006772354E7D);
    }

    @Inject(at = @At("HEAD"), method = "setSize(D)V", cancellable = true)
    private void setSize_1423030810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423030810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__76982682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-76982682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/level/border/BorderStatus;", cancellable = true)
    private void getStatus__1168880185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168880185L))
            info.setReturnValue(net.minecraft.world.level.border.BorderStatus.GROWING);
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteMaxSize()I", cancellable = true)
    private void getAbsoluteMaxSize__199891906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199891906L))
            info.setReturnValue(1565282304);
    }

    @Inject(at = @At("HEAD"), method = "removeListener(Lnet/minecraft/world/level/border/BorderChangeListener;)V", cancellable = true)
    private void removeListener_830948347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830948347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAbsoluteMaxSize(I)V", cancellable = true)
    private void setAbsoluteMaxSize_35962536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35962536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLerpTime()J", cancellable = true)
    private void getLerpTime_223499965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223499965L))
            info.setReturnValue(4893120088908602284L);
    }

    @Inject(at = @At("HEAD"), method = "lerpSizeBetween(DDJJ)V", cancellable = true)
    private void lerpSizeBetween__599458093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-599458093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWarningBlocks(I)V", cancellable = true)
    private void setWarningBlocks__68930212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-68930212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWarningTime(I)V", cancellable = true)
    private void setWarningTime__1635934237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635934237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/world/level/border/BorderChangeListener;)V", cancellable = true)
    private void addListener_205194648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(205194648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDistanceToBorder(DD)D", cancellable = true)
    private void getDistanceToBorder__1535158401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535158401L))
            info.setReturnValue(6.679280056576125E7D);
    }

    @Inject(at = @At("HEAD"), method = "getDistanceToBorder(Lnet/minecraft/world/entity/Entity;)D", cancellable = true)
    private void getDistanceToBorder__1815995076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815995076L))
            info.setReturnValue(6.679280067480465E7D);
    }

    @Inject(at = @At("HEAD"), method = "getDamagePerBlock()D", cancellable = true)
    private void getDamagePerBlock__507424644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507424644L))
            info.setReturnValue(6.67928002604302E7D);
    }

    @Inject(at = @At("HEAD"), method = "getSafeZone()D", cancellable = true)
    private void getSafeZone_403209570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403209570L))
            info.setReturnValue(6.6792800826782614E7D);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isWithinBounds_198954373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198954373L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(DDD)Z", cancellable = true)
    private void isWithinBounds__807244635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807244635L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(DD)Z", cancellable = true)
    private void isWithinBounds_24229597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24229597L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isWithinBounds__1846808900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846808900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void isWithinBounds_1175009481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175009481L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWithinBounds(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void isWithinBounds_256396093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256396093L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clampVec3ToBound(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampVec3ToBound_724035526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724035526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampVec3ToBound(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampVec3ToBound_993228766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993228766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInsideCloseToBorder(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isInsideCloseToBorder_1328016608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328016608L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyInitialSettings(J)V", cancellable = true)
    private void applyInitialSettings__1195051690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1195051690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape_782154903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782154903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterX()D", cancellable = true)
    private void getCenterX_1701080068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701080068L))
            info.setReturnValue(6.679280015187337E7D);
    }

    @Inject(at = @At("HEAD"), method = "getCenterZ()D", cancellable = true)
    private void getCenterZ_1758338370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758338370L))
            info.setReturnValue(6.679280028929591E7D);
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds__338594904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338594904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds__1999819216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999819216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampToBounds(DDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void clampToBounds__1455688560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455688560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSafeZone(D)V", cancellable = true)
    private void setSafeZone_1411698674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1411698674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDamagePerBlock(D)V", cancellable = true)
    private void setDamagePerBlock_1944266520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1944266520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLerpTarget()D", cancellable = true)
    private void getLerpTarget_1688789811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688789811L))
            info.setReturnValue(6.679280096087469E7D);
    }

    @Inject(at = @At("HEAD"), method = "getLerpSpeed()D", cancellable = true)
    private void getLerpSpeed_2139168823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139168823L))
            info.setReturnValue(6.6792800954670124E7D);
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_421164042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421164042L))
            info.setReturnValue(1046487512);
    }

    @Inject(at = @At("HEAD"), method = "getWarningTime()I", cancellable = true)
    private void getWarningTime__2061170269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061170269L))
            info.setReturnValue(1529832886);
    }

    @Inject(at = @At("HEAD"), method = "setCenter(DD)V", cancellable = true)
    private void setCenter__1044166356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044166356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMinZ()D", cancellable = true)
    private void getMinZ_366584915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366584915L))
            info.setReturnValue(6.67928000265229E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMinZ(F)D", cancellable = true)
    private void getMinZ_1218316933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218316933L))
            info.setReturnValue(6.679280001354823E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMinX()D", cancellable = true)
    private void getMinX_309326613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309326613L))
            info.setReturnValue(6.679280084771273E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMinX(F)D", cancellable = true)
    private void getMinX__556690429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556690429L))
            info.setReturnValue(6.679280034253218E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxZ()D", cancellable = true)
    private void getMaxZ__405893659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405893659L))
            info.setReturnValue(6.679280041995725E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxZ(F)D", cancellable = true)
    private void getMaxZ__1253682381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253682381L))
            info.setReturnValue(6.679280081188854E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxX()D", cancellable = true)
    private void getMaxX__463151961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463151961L))
            info.setReturnValue(6.679280004938788E7D);
    }

    @Inject(at = @At("HEAD"), method = "getMaxX(F)D", cancellable = true)
    private void getMaxX_1266277553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266277553L))
            info.setReturnValue(6.679280048312081E7D);
    }


}
