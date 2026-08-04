package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.BlockParticleOption.class)
public class BlockParticleOption_1950402214Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState__345356653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345356653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2069360757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069360757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_1715502130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715502130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1307356306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307356306L))
            info.setReturnValue(null);
    }


}
