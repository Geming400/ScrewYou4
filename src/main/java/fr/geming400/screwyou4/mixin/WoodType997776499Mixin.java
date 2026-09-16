package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.WoodType.class)
public class WoodType997776499Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1807043655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807043655L))
            info.setReturnValue("KaI\u608DV9I|1WPi\u9F3CW;g`\u79C9\u289EVw,SDy.C2g\"09'");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_89150231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89150231L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1768200024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768200024L))
            info.setReturnValue("\u6115d\u03DE?'kmO}\"\u4C469\uD171U[5k?\u50AB\u83B99&\uF9D8j\u8048*^g[?^]CK@ /");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values__1571550210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571550210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1555128590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555128590L))
            info.setReturnValue(480493725);
    }

    @Inject(at = @At("HEAD"), method = "setType()Lnet/minecraft/world/level/block/state/properties/BlockSetType;", cancellable = true)
    private void setType_1277837676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277837676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void soundType_603938627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603938627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingSignSoundType()Lnet/minecraft/world/level/block/SoundType;", cancellable = true)
    private void hangingSignSoundType_99671152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99671152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGateClose()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void fenceGateClose__997050535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997050535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fenceGateOpen()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void fenceGateOpen_854908751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854908751L))
            info.setReturnValue(null);
    }


}
