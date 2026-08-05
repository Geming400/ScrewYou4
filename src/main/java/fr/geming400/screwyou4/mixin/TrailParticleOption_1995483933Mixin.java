package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.TrailParticleOption.class)
public class TrailParticleOption_1995483933Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__913971105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913971105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void target__1201753835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201753835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_860023957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860023957L))
            info.setReturnValue("j)'<#eJ\uCC9Bo:\uD391\u539A u\u07ACv:\u5CF31 Ab^L\u129E\u7C5D_3HLOh}>RB3AE^i/ppCz,6m\uB5A2\"t-\u570E1M[\uC1D68OrN9b/\u73A8ZapkB;)U/Faa\u8838]2sU\"\u6BD7n\u6EBA2%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2033746674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746674L))
            info.setReturnValue(-85692015);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_2033746178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746178L))
            info.setReturnValue(191327193);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2024279038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024279038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_2033746178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746178L))
            info.setReturnValue(191327193);
    }


}
