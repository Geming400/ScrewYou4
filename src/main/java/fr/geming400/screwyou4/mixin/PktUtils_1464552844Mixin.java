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
            info.setReturnValue("\uADDA>+u_f`b\u1A39p&YR`4#m;Q|4\uD764O\u3EE3+.u\u194C!\u542D$mlatM!\u92733uOV\uC4FE9\uA3C1$I+YH^Ila(5m\u381AOCsj");
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BII)I", cancellable = true)
    private static void intFromByteArray__1827830896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827830896L))
            info.setReturnValue(1190560709);
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BI)I", cancellable = true)
    private static void intFromByteArray__720758789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720758789L))
            info.setReturnValue(-1044658535);
    }

    @Inject(at = @At("HEAD"), method = "stringFromByteArray([BII)Ljava/lang/String;", cancellable = true)
    private static void stringFromByteArray__762936891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762936891L))
            info.setReturnValue("\uD18F$\uC79BxS:J#;S\u70438\u335A*Y");
    }

    @Inject(at = @At("HEAD"), method = "intFromNetworkByteArray([BII)I", cancellable = true)
    private static void intFromNetworkByteArray__1827830896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827830896L))
            info.setReturnValue(1190560709);
    }


}
