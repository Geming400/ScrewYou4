package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ColorParticleOption.class)
public class ColorParticleOption1371158576Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1646362902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646362902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;I)Lnet/minecraft/core/particles/ColorParticleOption;", cancellable = true)
    private static void create__1932350538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932350538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;FFF)Lnet/minecraft/core/particles/ColorParticleOption;", cancellable = true)
    private static void create__1226365863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226365863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_1136258493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136258493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_728112669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728112669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAlpha()F", cancellable = true)
    private void getAlpha_1409417939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409417939L))
            info.setReturnValue(9.462743E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlue()F", cancellable = true)
    private void getBlue_1409417939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409417939L))
            info.setReturnValue(9.472741E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGreen()F", cancellable = true)
    private void getGreen_1409417939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409417939L))
            info.setReturnValue(9.472741E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRed()F", cancellable = true)
    private void getRed_1409417939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409417939L))
            info.setReturnValue(9.472741E8F);
    }


}
