package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseSettings.class)
public class NoiseSettings613824767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1999337026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999337026L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__521635208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521635208L))
            info.setReturnValue("%?pHK\u4595\uBCDCB7hQO\u85F4{f\u9A45y*LSnCEnu\u7A78hFBbB}njW8ZU\uC81Bi>U?^1t))_\u04DC%*Zxb\"G}`\u0E12}_^wugi!]^[Sl{#,#feb\uA422G\u16F5?i:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_652087509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087509L))
            info.setReturnValue(1694411612);
    }

    @Inject(at = @At("HEAD"), method = "create(IIII)Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private static void create__77133873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77133873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }

    @Inject(at = @At("HEAD"), method = "clampToHeightAccessor(Lnet/minecraft/world/level/LevelHeightAccessor;)Lnet/minecraft/world/level/levelgen/NoiseSettings;", cancellable = true)
    private void clampToHeightAccessor__2088661450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088661450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCellWidth()I", cancellable = true)
    private void getCellWidth_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }

    @Inject(at = @At("HEAD"), method = "getCellHeight()I", cancellable = true)
    private void getCellHeight_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }

    @Inject(at = @At("HEAD"), method = "noiseSizeHorizontal()I", cancellable = true)
    private void noiseSizeHorizontal_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }

    @Inject(at = @At("HEAD"), method = "noiseSizeVertical()I", cancellable = true)
    private void noiseSizeVertical_652087013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652087013L))
            info.setReturnValue(297003607);
    }


}
