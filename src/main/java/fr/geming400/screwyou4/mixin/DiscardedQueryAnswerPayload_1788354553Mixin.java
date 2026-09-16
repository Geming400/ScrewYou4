package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.custom.DiscardedQueryAnswerPayload.class)
public class DiscardedQueryAnswerPayload_1788354553Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_879728284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879728284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1736189219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736189219L))
            info.setReturnValue("G\u8E9AwVDz{%NK:=\u047B\uB49D gSF\u96D9sq9-KWgM\u828A8\uA2D6!KpF9\uCEB9<?BUH\u9C32B\u5D8B\u9CDDY*\u281AhkjWcQ=4+dz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1949260653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949260653L))
            info.setReturnValue(777920340);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_359367894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(359367894L))
            info.cancel();
    }


}
