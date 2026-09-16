package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Notification.class)
public class Notification819699987Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__88926281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88926281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1590123512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590123512L))
            info.setReturnValue("1vH6$\u2914\u6702");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1377052078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377052078L))
            info.setReturnValue(-1685975256);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_1523239899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523239899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes_14141621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14141621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeParams(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void encodeParams__217069057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217069057L))
            info.setReturnValue(null);
    }


}
