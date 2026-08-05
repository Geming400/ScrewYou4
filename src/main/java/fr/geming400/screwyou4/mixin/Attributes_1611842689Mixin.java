package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Attributes.class)
public class Attributes_1611842689Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_703216420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703216420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1912701083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912701083L))
            info.setReturnValue("\u75F3tFhi:e\u4969E*\"M`+LN}ixqx,t6utC\u084D5\u3AF7XFf)>A2\u69709<`] B}`\u5472m\u8882JL\uB1766bLjA/R\uB2CFhW[>\"yiFfZX-G\"^&uI0|rj+gBsB(Y\u83BAA 2\u4FD7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2125772517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125772517L))
            info.setReturnValue(-63258023);
    }

    @Inject(at = @At("HEAD"), method = "discoverable()Z", cancellable = true)
    private void discoverable__1927550124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927550124L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Z", cancellable = true)
    private void allowPreServerInit__609020630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609020630L))
            info.setReturnValue(true);
    }


}
