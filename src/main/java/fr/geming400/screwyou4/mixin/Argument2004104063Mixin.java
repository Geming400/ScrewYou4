package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignableCommand.Argument.class)
public class Argument2004104063Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_868643592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868643592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_868643592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868643592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__905350974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905350974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868644088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868644088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2042366805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042366805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "node()Lcom/mojang/brigadier/tree/ArgumentCommandNode;", cancellable = true)
    private void node__1759699701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759699701L))
            info.setReturnValue(null);
    }


}
