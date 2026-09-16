package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.GeyserBaseParticleOptions.class)
public class GeyserBaseParticleOptions_771199068Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void type__1413671225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413671225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__137427201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137427201L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1541622592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541622592L))
            info.setReturnValue("$+0p\u733Ab\uD13Eoz)t\"\u931B:\u82DF&/\uBA22b5FoM\uB003j]=\uB5FFt\u8381OuD{\"?t!^8P|Z/\uFE2D\u9EF0\u2758K5h1EL\u1707cFC&D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1328551158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328551158L))
            info.setReturnValue(-154915858);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_968313745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968313745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_337579134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337579134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "burstImpulseBase()F", cancellable = true)
    private void burstImpulseBase_1081612952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081612952L))
            info.setReturnValue(6.081408E8F);
    }

    @Inject(at = @At("HEAD"), method = "waterBlocks()I", cancellable = true)
    private void waterBlocks__1096303900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096303900L))
            info.setReturnValue(46354309);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__148060994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148060994L))
            info.setReturnValue(null);
    }


}
