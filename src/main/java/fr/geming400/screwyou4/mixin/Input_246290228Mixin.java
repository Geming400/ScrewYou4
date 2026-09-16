package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.Input.class)
public class Input_246290228Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__662336041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662336041L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1016713752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016713752L))
            info.setReturnValue("HO(\u731C7'C%=W0Q/+z6|aD])\u99F1f\u88ACy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_803642318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803642318L))
            info.setReturnValue(785715279);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__1992338469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1992338469L))
            info.setReturnValue("&\u04ECD4DqojE@\uA3684.%ME\u84500|3B[mt^v1\uC086FT)\u39C5 \u33EE\u62B0BE.g/8Q\u7D5DLk`ARWFN<\uAE41k^=.%f@Y<l\u93CB#lWx\u932Bru^:H=+S`9?iK%nX{2|6");
    }

    @Inject(at = @At("HEAD"), method = "control()Lnet/minecraft/server/dialog/input/InputControl;", cancellable = true)
    private void control_155254775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155254775L))
            info.setReturnValue(null);
    }


}
