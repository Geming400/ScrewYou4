package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.custom.DiscardedQueryAnswerPayload.class)
public class DiscardedQueryAnswerPayload_1788354553Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1121100485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121100485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_652894577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652894577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1826617294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826617294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_1434861431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434861431L))
            info.cancel();
    }


}
