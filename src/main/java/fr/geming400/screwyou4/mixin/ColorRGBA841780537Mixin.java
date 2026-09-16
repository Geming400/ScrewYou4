package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ColorRGBA.class)
public class ColorRGBA841780537Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__66845731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66845731L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1612203566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612203566L))
            info.setReturnValue("bl'uw\u3A3CJ{VA1xY\u07EEp%R+/5\u381A\u6B1BOX*U\u13E8h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1399132628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399132628L))
            info.setReturnValue(-148090014);
    }

    @Inject(at = @At("HEAD"), method = "rgba()I", cancellable = true)
    private void rgba__332422549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332422549L))
            info.setReturnValue(1028015185);
    }


}
