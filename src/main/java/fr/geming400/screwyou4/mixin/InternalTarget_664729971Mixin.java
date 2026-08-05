package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.InternalTarget.class)
public class InternalTarget_664729971Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2050242229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050242229L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__470730005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-470730005L))
            info.setReturnValue("(Z=of8\u5296pAQ\u16BCZO3[w=+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_702992712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702992712L))
            info.setReturnValue(604515904);
    }

    @Inject(at = @At("HEAD"), method = "width()Ljava/util/Optional;", cancellable = true)
    private void width_910191392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910191392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "persistent()Z", cancellable = true)
    private void persistent_703008553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703008553L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "height()Ljava/util/Optional;", cancellable = true)
    private void height_910191392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910191392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearColor()I", cancellable = true)
    private void clearColor_702992216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702992216L))
            info.setReturnValue(-768268171);
    }


}
