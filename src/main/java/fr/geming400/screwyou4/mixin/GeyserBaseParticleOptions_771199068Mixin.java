package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.GeyserBaseParticleOptions.class)
public class GeyserBaseParticleOptions_771199068Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void type_1046403393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046403393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2138255970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138255970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__364260908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364260908L))
            info.setReturnValue("CGQd)<YP\u1073#iL2:qa!\uC7C8}_0m//k`o(44jP.}?i_pi\u1D28XU' Mwvi(qKHIk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_809461809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809461809L))
            info.setReturnValue(-1052605630);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1046403393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046403393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/core/particles/ParticleType;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void codec_536298984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536298984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/core/particles/ParticleType;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_128153160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128153160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterBlocks()I", cancellable = true)
    private void waterBlocks_809461313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809461313L))
            info.setReturnValue(1844953661);
    }

    @Inject(at = @At("HEAD"), method = "burstImpulseBase()F", cancellable = true)
    private void burstImpulseBase_809458430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809458430L))
            info.setReturnValue(3.16366E7F);
    }


}
