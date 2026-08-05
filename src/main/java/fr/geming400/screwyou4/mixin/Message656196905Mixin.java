package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.Message.class)
public class Message656196905Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2041709164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041709164L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__479263070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479263070L))
            info.setReturnValue(")Q_<G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_694459647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694459647L))
            info.setReturnValue(-1963319921);
    }

    @Inject(at = @At("HEAD"), method = "literal()Ljava/util/Optional;", cancellable = true)
    private void literal_901658327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901658327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translatable()Ljava/util/Optional;", cancellable = true)
    private void translatable_901658327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901658327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translatableParams()Ljava/util/Optional;", cancellable = true)
    private void translatableParams_901658327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901658327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asComponent()Ljava/util/Optional;", cancellable = true)
    private void asComponent_901658327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901658327L))
            info.setReturnValue(null);
    }


}
