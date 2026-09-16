package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.GeyserParticleOptions.class)
public class GeyserParticleOptions_2014174987Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void type__170695306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170695306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1105548718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105548718L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1510368785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510368785L))
            info.setReturnValue("\uD2FBS\"tfm\u697F0:Q\uD0F98Xn3PgRGhH#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1723440219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723440219L))
            info.setReturnValue(-1941003196);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2083677632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083677632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_1580555053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580555053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1094914925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094914925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterBlocks()I", cancellable = true)
    private void waterBlocks_146672019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146672019L))
            info.setReturnValue(-1781502162);
    }


}
