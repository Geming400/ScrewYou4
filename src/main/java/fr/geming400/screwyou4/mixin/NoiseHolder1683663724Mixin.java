package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunction.NoiseHolder.class)
public class NoiseHolder1683663724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_775037456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775037456L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1840880047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840880047L))
            info.setReturnValue("L\uBD15|xDX7)WgKMRJ\u5D9B\u7EB79i&O\uBE1B \u1857/$ !\u28F7TYco-i)(\u5B94n9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2053951481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053951481L))
            info.setReturnValue(2094071437);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue__1314023492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314023492L))
            info.setReturnValue(7.240153005300802E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue__1793380288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793380288L))
            info.setReturnValue(7.240153000035473E8D);
    }

    @Inject(at = @At("HEAD"), method = "noiseData()Lnet/minecraft/core/Holder;", cancellable = true)
    private void noiseData_231897348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231897348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise()Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private void noise__410122629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410122629L))
            info.setReturnValue(null);
    }


}
