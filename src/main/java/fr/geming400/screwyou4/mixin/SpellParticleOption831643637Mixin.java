package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SpellParticleOption.class)
public class SpellParticleOption831643637Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1106847963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106847963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;IF)Lnet/minecraft/core/particles/SpellParticleOption;", cancellable = true)
    private static void create__1590337568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590337568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;FFFF)Lnet/minecraft/core/particles/SpellParticleOption;", cancellable = true)
    private static void create__1179649123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179649123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_596743554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596743554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPower()F", cancellable = true)
    private void getPower_869903000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869903000L))
            info.setReturnValue(4.212034E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGreen()F", cancellable = true)
    private void getGreen_869903000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869903000L))
            info.setReturnValue(4.212034E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRed()F", cancellable = true)
    private void getRed_869903000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869903000L))
            info.setReturnValue(4.212034E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlue()F", cancellable = true)
    private void getBlue_869903000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869903000L))
            info.setReturnValue(4.212034E8F);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_188597730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188597730L))
            info.setReturnValue(null);
    }


}
