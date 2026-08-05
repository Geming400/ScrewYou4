package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRPCErrors.class)
public class JsonRPCErrors1474395786Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/jsonrpc/JsonRPCErrors;", cancellable = true)
    private static void values_1282228745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282228745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/JsonRPCErrors;", cancellable = true)
    private static void valueOf_298491664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(298491664L))
            info.setReturnValue(net.minecraft.server.jsonrpc.JsonRPCErrors.INVALID_REQUEST);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void create_824078960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824078960L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createWithoutData(Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void createWithoutData__436875968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436875968L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "createWithUnknownId(Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void createWithUnknownId_241953454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241953454L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }


}
