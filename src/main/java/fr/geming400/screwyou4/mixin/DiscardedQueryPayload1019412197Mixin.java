package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.custom.DiscardedQueryPayload.class)
public class DiscardedQueryPayload1019412197Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1890042840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890042840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__116047778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116047778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1057674939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057674939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1423654356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423654356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_665919076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(665919076L))
            info.cancel();
    }


}
