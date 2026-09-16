package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.PktUtils.class)
public class PktUtils_1464552844Mixin {
        @Inject(at = @At("HEAD"), method = "toHexString(B)Ljava/lang/String;", cancellable = true)
    private static void toHexString_1937231465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937231465L))
            info.setReturnValue("fruSe\u3A22]:\uAF762rfu3D>$C0<$\u4FF1yhutkFN@");
    }

    @Inject(at = @At("HEAD"), method = "intFromNetworkByteArray([BII)I", cancellable = true)
    private static void intFromNetworkByteArray__1476568812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476568812L))
            info.setReturnValue(-154123095);
    }

    @Inject(at = @At("HEAD"), method = "stringFromByteArray([BII)Ljava/lang/String;", cancellable = true)
    private static void stringFromByteArray_132543323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132543323L))
            info.setReturnValue(")<\u968EY *M>4\uA0AF =WfN>w+BiQO@a[(A-Kv`?");
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BII)I", cancellable = true)
    private static void intFromByteArray_1830451352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830451352L))
            info.setReturnValue(884574005);
    }

    @Inject(at = @At("HEAD"), method = "intFromByteArray([BI)I", cancellable = true)
    private static void intFromByteArray__1434033677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434033677L))
            info.setReturnValue(-1899911837);
    }


}
