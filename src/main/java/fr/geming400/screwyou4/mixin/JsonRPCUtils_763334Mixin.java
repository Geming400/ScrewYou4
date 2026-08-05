package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRPCUtils.class)
public class JsonRPCUtils_763334Mixin {
        @Inject(at = @At("HEAD"), method = "getMethodName(Lcom/google/gson/JsonObject;)Ljava/lang/String;", cancellable = true)
    private static void getMethodName__1427384166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427384166L))
            info.setReturnValue("(Im璨Rn8x|ℒ[=⛗zg=<ffMbꭚu?");
    }

    @Inject(at = @At("HEAD"), method = "getResult(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getResult__26318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParams(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getParams__26318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createError(Lcom/google/gson/JsonElement;Ljava/lang/String;ILjava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createError__2061031762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061031762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getError_1539748860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539748860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRequestId(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getRequestId__26318347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26318347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSuccessResult(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createSuccessResult__295049656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295049656L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createRequest(Ljava/lang/Integer;Lnet/minecraft/resources/Identifier;Ljava/util/List;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createRequest__1132029438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132029438L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createRequest(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createRequest_421458944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421458944L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }


}
