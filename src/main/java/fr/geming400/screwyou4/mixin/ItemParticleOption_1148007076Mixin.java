package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ItemParticleOption.class)
public class ItemParticleOption_1148007076Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1345121753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345121753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_714387142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714387142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_228747014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228747014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getItem_1823060598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823060598L))
            info.setReturnValue(null);
    }


}
