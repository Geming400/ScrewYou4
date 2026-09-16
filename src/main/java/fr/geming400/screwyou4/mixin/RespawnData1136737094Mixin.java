package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelData.RespawnData.class)
public class RespawnData1136737094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_228110826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228110826L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1907160619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907160619L))
            info.setReturnValue("a5QR@TO;Sv8Y)644'?)mb5]UYMB\uB673%\u4669)CR8ePH#l\"c>fVKR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1694089185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694089185L))
            info.setReturnValue(71802330);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;FF)Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private static void of_357445327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357445327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1144039181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144039181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1300771281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300771281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pitch()F", cancellable = true)
    private void pitch_784681641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784681641L))
            info.setReturnValue(2.279504E8F);
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_902062298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902062298L))
            info.setReturnValue(2.279504E8F);
    }

    @Inject(at = @At("HEAD"), method = "globalPos()Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private void globalPos_1462211024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462211024L))
            info.setReturnValue(null);
    }


}
