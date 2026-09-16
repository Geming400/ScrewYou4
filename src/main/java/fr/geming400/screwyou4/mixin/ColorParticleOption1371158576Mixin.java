package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ColorParticleOption.class)
public class ColorParticleOption1371158576Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1568273254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568273254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;I)Lnet/minecraft/core/particles/ColorParticleOption;", cancellable = true)
    private static void create_488582578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488582578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/particles/ParticleType;FFF)Lnet/minecraft/core/particles/ColorParticleOption;", cancellable = true)
    private static void create_1713051477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713051477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_937538643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937538643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_451898515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451898515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAlpha()F", cancellable = true)
    private void getAlpha__192465877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192465877L))
            info.setReturnValue(4.001634E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRed()F", cancellable = true)
    private void getRed__1684260264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684260264L))
            info.setReturnValue(4.001634E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGreen()F", cancellable = true)
    private void getGreen_682218918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682218918L))
            info.setReturnValue(4.001634E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlue()F", cancellable = true)
    private void getBlue__1036817405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036817405L))
            info.setReturnValue(4.001634E8F);
    }


}
