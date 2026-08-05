package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.UVPair.class)
public class UVPair_242443055Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__666183214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666183214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1012866083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012866083L))
            info.setReturnValue("]%RJ[apgxiB4!:Am`CO3Fj\uD5D4|+BZYu\uFEB5#jpn\u8A0EtaLR\u2D53\u375B96\u634A2{T;<eP:\";Z\u144Ca ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_799795145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799795145L))
            info.setReturnValue(1727771201);
    }

    @Inject(at = @At("HEAD"), method = "v()F", cancellable = true)
    private void v__636025061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636025061L))
            info.setReturnValue(7.70991E7F);
    }

    @Inject(at = @At("HEAD"), method = "u()F", cancellable = true)
    private void u__664654212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664654212L))
            info.setReturnValue(7.70991E7F);
    }

    @Inject(at = @At("HEAD"), method = "pack(FF)J", cancellable = true)
    private static void pack_1128610900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128610900L))
            info.setReturnValue(-794227909113857254L);
    }

    @Inject(at = @At("HEAD"), method = "unpackV(J)F", cancellable = true)
    private static void unpackV__505293273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505293273L))
            info.setReturnValue(7.70991E7F);
    }

    @Inject(at = @At("HEAD"), method = "unpackU(J)F", cancellable = true)
    private static void unpackU__1392796954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392796954L))
            info.setReturnValue(7.70991E7F);
    }


}
