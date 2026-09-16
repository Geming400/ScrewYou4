package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SculkChargeParticleOptions.class)
public class SculkChargeParticleOptions224532542Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__684093726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684093726L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_994956067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994956067L))
            info.setReturnValue(" \u2ABB\u693575J\u48DAwGhy\u01EBvu&+[s\u9718$fJg2he4i\u7A68sAE.{\u8F51\uD2D5qr\u2E49\uC0F3d\uABC2'dfk\u24F8\u3FFD\u2A89& ^>J.tE\uBEF6RWc-[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_781884633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781884633L))
            info.setReturnValue(827741263);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_421647220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421647220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "roll()F", cancellable = true)
    private void roll_707930244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707930244L))
            info.setReturnValue(1.278796E8F);
    }


}
