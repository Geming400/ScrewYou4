package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.GeyserParticleOptions.class)
public class GeyserParticleOptions_2014174987Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void type__2005587984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005587984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__895280051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895280051L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_878715011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878715011L))
            info.setReturnValue("&I.R|\u9C05|Eq^7+$/+.)'\u3529Y%\u8D07\uBFD8e@\u6606ftWKznD\u7702sWPR9!C`HY@Y)&bGq1|-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2052437728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052437728L))
            info.setReturnValue(1050759849);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2005587984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005587984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_1779274903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779274903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1371129079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371129079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterBlocks()I", cancellable = true)
    private void waterBlocks_2052437232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052437232L))
            info.setReturnValue(1253907269);
    }


}
