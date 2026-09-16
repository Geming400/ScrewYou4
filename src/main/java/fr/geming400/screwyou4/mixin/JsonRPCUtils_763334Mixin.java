package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRPCUtils.class)
public class JsonRPCUtils_763334Mixin {
        @Inject(at = @At("HEAD"), method = "getMethodName(Lcom/google/gson/JsonObject;)Ljava/lang/String;", cancellable = true)
    private static void getMethodName_2017620764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017620764L))
            info.setReturnValue("o:5;CaGIJCEC.h\uD71AV3u.|qh:>JC:)r+QZ#(75KhAh3+4m67\u32EB^\uD0B3/YB,Xo};`kBfb*<-Z\uA137\uB65AG");
    }

    @Inject(at = @At("HEAD"), method = "getResult(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getResult__593254462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593254462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParams(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getParams__1369448711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369448711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createError(Lcom/google/gson/JsonElement;Ljava/lang/String;ILjava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createError__754144742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754144742L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createRequest(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createRequest_305282029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305282029L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createRequest(Ljava/lang/Integer;Lnet/minecraft/resources/Identifier;Ljava/util/List;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createRequest_1588764847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588764847L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getRequestId(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getRequestId__963697375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963697375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSuccessResult(Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void createSuccessResult_1213497260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213497260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getError_504534350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504534350L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }


}
