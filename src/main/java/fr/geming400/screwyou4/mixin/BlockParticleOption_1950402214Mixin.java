package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.BlockParticleOption.class)
public class BlockParticleOption_1950402214Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_956571438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956571438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2147450405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147450405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_1516782280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516782280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1031142152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031142152L))
            info.setReturnValue(null);
    }


}
