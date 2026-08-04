package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRPCErrors.class)
public class JsonRPCErrors1474395786Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/jsonrpc/JsonRPCErrors;", cancellable = true)
    private static void values__1656148245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656148245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/jsonrpc/JsonRPCErrors;", cancellable = true)
    private static void valueOf_349046248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349046248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void create__203437332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203437332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithUnknownId(Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void createWithUnknownId_53190699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53190699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithoutData(Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonObject;", cancellable = true)
    private void createWithoutData__43746442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43746442L))
            info.setReturnValue(null);
    }


}
