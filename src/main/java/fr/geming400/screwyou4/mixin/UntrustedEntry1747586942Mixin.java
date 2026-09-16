package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.UntrustedEntry.class)
public class UntrustedEntry1747586942Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void type__560242149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560242149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_838960674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838960674L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1776956829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776956829L))
            info.setReturnValue("DnYZv\uC66BC_]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1990028263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990028263L))
            info.setReturnValue(1788503026);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/lang/String;", cancellable = true)
    private void link_1868654465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868654465L))
            info.setReturnValue("\u69A4\u8442S\u1F6EgQ@Tx2$6\u7D4C_j wj8`\uA8E2R$|y");
    }


}
