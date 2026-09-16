package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Method.class)
public class Method764621449Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__144004819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144004819L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1535044974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535044974L))
            info.setReturnValue("Di*XbE_P\u02C0`\u080A.\u11AB=Y\u258D[N\u92EC}MrY2+=hiAY_0dOq\u69F0xf\u17AA<bC&usW/EPn+\"lmfEk@/!VDM.?{'C8d\uFE505E[S#I\u1C9A\u6D911");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1321973540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321973540L))
            info.setReturnValue(-1665345139);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_1468161361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468161361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes__40936917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40936917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeParams(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void encodeParams__272147595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272147595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decodeResult(Lcom/google/gson/JsonElement;)Ljava/lang/Object;", cancellable = true)
    private void decodeResult_1249640666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249640666L))
            info.setReturnValue(null);
    }


}
