package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.PktUtils.class)
public class PktUtils_1464552844Mixin {
        @Inject(at = @At("HEAD"), method = "toHexString(B)Ljava/lang/String;", cancellable = true)
    private static void toHexString_1425175642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425175642L))
            info.setReturnValue("귚>+u_f`bᨹp&YR`4#m;Q|4흤O㻣+.u᥌!吭$mlatM!鉳3uOV쓾9ꏁ$I+YH^Ila(5m㠚OCsj");
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BII)I", cancellable = true)
    private static void intFromByteArray__1827830896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827830896L))
            info.setReturnValue(1141241509);
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BI)I", cancellable = true)
    private static void intFromByteArray__720758789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720758789L))
            info.setReturnValue(-1093977735);
    }

    @Inject(at = @At("HEAD"), method = "intFromNetworkByteArray([BII)I", cancellable = true)
    private static void intFromNetworkByteArray__1827830896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827830896L))
            info.setReturnValue(1141241509);
    }

    @Inject(at = @At("HEAD"), method = "stringFromByteArray([BII)Ljava/lang/String;", cancellable = true)
    private static void stringFromByteArray__762936891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762936891L))
            info.setReturnValue("톏$잛xS:J#;S灃8㍚*Y");
    }


}
