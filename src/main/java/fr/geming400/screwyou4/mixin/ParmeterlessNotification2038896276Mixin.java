package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.ParmeterlessNotification.class)
public class ParmeterlessNotification2038896276Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1130270008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130270008L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1485647495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485647495L))
            info.setReturnValue("Y'_ub&(T\u387E0Vas_SK4{Hw/\uB9D8nU\u6C6AzZGdODv+b0I\u4104O0&=zgt2()W5AxZ'w{i1q6q5#$l\u7370\"T`Oi5zS.\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1698718929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698718929L))
            info.setReturnValue(-1063358711);
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/server/jsonrpc/api/MethodInfo;", cancellable = true)
    private void info__1552531108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552531108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Lnet/minecraft/server/jsonrpc/OutgoingRpcMethod$Attributes;", cancellable = true)
    private void attributes_1233337910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233337910L))
            info.setReturnValue(null);
    }


}
