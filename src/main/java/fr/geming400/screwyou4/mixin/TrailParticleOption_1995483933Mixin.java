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
            info.setReturnValue("j)'<#eJ첛o:펑厚 uެv:峳1 Ab^Lኞ籝_3HLOh}>RB3AE^i/ppCz,6m떢\"t-圎1M[쇖8OrN9b/玨ZapkB;)U/Faa蠸]2sU\"毗n溺2%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2033746674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746674L))
            info.setReturnValue(472906385);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_2033746178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746178L))
            info.setReturnValue(749925593);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2024279038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024279038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_2033746178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033746178L))
            info.setReturnValue(749925593);
    }


}
