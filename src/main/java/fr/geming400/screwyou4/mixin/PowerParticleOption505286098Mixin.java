package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.PowerParticleOption.class)
public class PowerParticleOption505286098Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_780490424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780490424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;F)Lnet/minecraft/core/particles/PowerParticleOption;", cancellable = true)
    private static void create__889527271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889527271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_270386015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270386015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPower()F", cancellable = true)
    private void getPower_543545461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543545461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__137759809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137759809L))
            info.setReturnValue(null);
    }


}
