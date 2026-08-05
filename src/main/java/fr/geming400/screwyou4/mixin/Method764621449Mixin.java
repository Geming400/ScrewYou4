package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Method.class)
public class Method764621449Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2144833588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144833588L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__370838526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370838526L))
            info.setReturnValue("vO'X4]w\u5BADxF>r\u9A7D2FN|6HDAtMF=\uC1C5=i&`M9Q'v&w*\u3E7E\uABC3$\u7EC8!,\uB65C\u8BBB|W\uB40ETw}Fl>25G\u803FCC]?\u74A9n3x;#)y_n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_802884191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802884191L))
            info.setReturnValue(-40965168);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_90200127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90200127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes_1758843490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758843490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeParams(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void encodeParams_327665713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327665713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decodeResult(Lcom/google/gson/JsonElement;)Ljava/lang/Object;", cancellable = true)
    private void decodeResult_1944346213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944346213L))
            info.setReturnValue(new java.lang.Object());
    }


}
