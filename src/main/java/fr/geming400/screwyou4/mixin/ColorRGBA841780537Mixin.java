package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ColorRGBA.class)
public class ColorRGBA841780537Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2067674500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067674500L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__293679934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293679934L))
            info.setReturnValue("\u7BCE7P,|{\u5C8B(SZU\u2EE33)u\u5E82TI@zVfusb{W\u42AE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_880043279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880043279L))
            info.setReturnValue(1800770413);
    }

    @Inject(at = @At("HEAD"), method = "rgba()I", cancellable = true)
    private void rgba_880042783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880042783L))
            info.setReturnValue(2003917833);
    }


}
