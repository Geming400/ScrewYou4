package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ItemParticleOption.class)
public class ItemParticleOption_1148007076Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1423211401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423211401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getItem__1393072915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393072915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_913106992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913106992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_504961168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504961168L))
            info.setReturnValue(null);
    }


}
