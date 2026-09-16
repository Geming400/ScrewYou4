package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.PowerParticleOption.class)
public class PowerParticleOption505286098Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_702400776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702400776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;F)Lnet/minecraft/core/particles/PowerParticleOption;", cancellable = true)
    private static void create_1531405845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531405845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_71666165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71666165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__413973963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413973963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPower()F", cancellable = true)
    private void getPower_595452550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595452550L))
            info.setReturnValue(1.695265E8F);
    }


}
