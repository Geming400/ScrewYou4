package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SpellParticleOption.class)
public class SpellParticleOption831643637Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1028758315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028758315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;IF)Lnet/minecraft/core/particles/SpellParticleOption;", cancellable = true)
    private static void create_444144996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444144996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;FFFF)Lnet/minecraft/core/particles/SpellParticleOption;", cancellable = true)
    private static void create__252024799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252024799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_398023704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398023704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__87616424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87616424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGreen()F", cancellable = true)
    private void getGreen_142703979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142703979L))
            info.setReturnValue(6.956598E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlue()F", cancellable = true)
    private void getBlue__1576332344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576332344L))
            info.setReturnValue(6.956598E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPower()F", cancellable = true)
    private void getPower_921810089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921810089L))
            info.setReturnValue(6.956598E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRed()F", cancellable = true)
    private void getRed_2071192093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071192093L))
            info.setReturnValue(6.956598E8F);
    }


}
