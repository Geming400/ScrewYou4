package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.TextInput.MultilineOptions.class)
public class MultilineOptions1822002884Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1087452153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087452153L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_686542909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686542909L))
            info.setReturnValue("d^Ὠnl］I%鮣16; AL*Qށ%9c䩅B**Yr*d햲蚭滫k鄹UIUcSh&!O柗F:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1860265626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860265626L))
            info.setReturnValue(-956785375);
    }

    @Inject(at = @At("HEAD"), method = "maxLines()Ljava/util/Optional;", cancellable = true)
    private void maxLines_2067464306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067464306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()Ljava/util/Optional;", cancellable = true)
    private void height_2067464306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067464306L))
            info.setReturnValue(null);
    }


}
