package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Notification.class)
public class Notification819699987Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2089755050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089755050L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__315759988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315759988L))
            info.setReturnValue("ଡ0|veSn|mTAl@H FYO贡vmUm,嵡(.XI`4W#?廔>y+0|DU:t睮⋨䙐Q4{B[[5㙤H\"2].VP@팭cN倏<8`*KfC[J$@p%o-_Ag.ha駯IRo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_857962729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857962729L))
            info.setReturnValue(-1135677203);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info_145278665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145278665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes_1813922028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813922028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeParams(Ljava/lang/Object;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void encodeParams_382744251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382744251L))
            info.setReturnValue(null);
    }


}
