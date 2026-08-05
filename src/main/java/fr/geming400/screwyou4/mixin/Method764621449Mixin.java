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
            info.setReturnValue("vO'X4]w宭xF>r驽2FN|6HDAtMF=쇅=i&`M9Q'v&w*㹾ꯃ$终!,뙜讻|W됎Tw}Fl>25G耿CC]?璩n3x;#)y_n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_802884191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802884191L))
            info.setReturnValue(-29936468);
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

    @Inject(at = @At("HEAD"), method = "decodeResult(Lcom/google/gson/JsonElement;)Ljava/lang/Object;", cancellable = true)
    private void decodeResult_1944346213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944346213L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "encodeParams(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void encodeParams_327665713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327665713L))
            info.setReturnValue(null);
    }


}
