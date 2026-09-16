package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.NameAndId.class)
public class NameAndId_2101264183Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1384435958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384435958L))
            info.setReturnValue("pX\uB3D7E`a.J-1}<?F& 08vzalUe-5a!L&\u04A1w+)Q|\u4341\uA876:o?CdV|\u93597\u1F1B:\u41E9Cs^12vJ[\u6A6Fr a\uB3A3c|\u64DEl3_C:");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1192637914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192637914L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1423279589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423279589L))
            info.setReturnValue("<%\u554E3%+5^xN\u777AQCgzgG#\u81D5y?@xq\u2186ndf$cVJ\uB0C5^r\uA377(:#@1\u36ACJ!([\u6C25ItTEd&FG\uAFD8H^fF\uC0B9E\u7E15:dW2\u68C8iPG&\u96B57.9\u7658+M\uB5FBi#CY_@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1636351023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636351023L))
            info.setReturnValue(-1621339344);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id__1369859356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369859356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendTo(Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void appendTo__28536704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-28536704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/JsonObject;)Lnet/minecraft/server/players/NameAndId;", cancellable = true)
    private static void fromJson__1695574640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695574640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOffline(Ljava/lang/String;)Lnet/minecraft/server/players/NameAndId;", cancellable = true)
    private static void createOffline__253160377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253160377L))
            info.setReturnValue(null);
    }


}
