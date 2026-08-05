package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ChainedJsonException.Entry.class)
public class Entry740428289Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__395032182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395032182L))
            info.setReturnValue("B豉?a&KF4I>叇^\"2'{+z]@6NR&`dw7A짔SJ滑ꦹztNW8!");
    }

    @Inject(at = @At("HEAD"), method = "getFilename()Ljava/lang/String;", cancellable = true)
    private void getFilename__395032182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395032182L))
            info.setReturnValue("B豉?a&KF4I>叇^\"2'{+z]@6NR&`dw7A짔SJ滑ꦹztNW8!");
    }

    @Inject(at = @At("HEAD"), method = "getJsonKeys()Ljava/lang/String;", cancellable = true)
    private void getJsonKeys__395032182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395032182L))
            info.setReturnValue("B豉?a&KF4I>叇^\"2'{+z]@6NR&`dw7A짔SJ滑ꦹztNW8!");
    }


}
