package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.tooltip.BundleTooltip.class)
public class BundleTooltip_1325762141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1583692897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583692897L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_190302165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190302165L))
            info.setReturnValue("q\uCC0E\uD4961024E0Fkz\u15DFnq\u74557u<\uD2C1j*Z@)^\u9136`c_4;O:V.X\u7598oMsG/|r.$\u12ED]EiG\u2B4B2bc\u37F9USwg/L;Rn\u78FD[hSU(f\u40EEmx%TX3o\u25C5\uCD8B3)O(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364024882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364024882L))
            info.setReturnValue(1987700516);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/component/BundleContents;", cancellable = true)
    private void contents_218253063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218253063L))
            info.setReturnValue(null);
    }


}
