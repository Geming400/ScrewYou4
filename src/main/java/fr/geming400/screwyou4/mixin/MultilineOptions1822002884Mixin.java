package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.TextInput.MultilineOptions.class)
public class MultilineOptions1822002884Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_913376616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913376616L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1702540887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702540887L))
            info.setReturnValue("\u3CE0G\u284E]c(W6}F@T+&MS7zn$Nf$\u17D2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1915612321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915612321L))
            info.setReturnValue(522814233);
    }

    @Inject(at = @At("HEAD"), method = "height()Ljava/util/Optional;", cancellable = true)
    private void height__1989391207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989391207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxLines()Ljava/util/Optional;", cancellable = true)
    private void maxLines_2074343277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074343277L))
            info.setReturnValue(null);
    }


}
