package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CommonLinks.class)
public class CommonLinks2032759648Mixin {
        @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;Z)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__1470169227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470169227L))
            info.setReturnValue("bUTd,\uA24B6s\u5257'Zc$zd\u74BFc+\uC38Dh(M%f[M|g#6\uB15DWz&EmvG\uD7E9e\uB325`\u7338r\uD775N\u6F8CZ\uC546F&}:");
    }

    @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__684619325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684619325L))
            info.setReturnValue("/Rw/$Ku'\"d^KtX+n\u3E5EK\u6B4F\u710A$?RFo|MQ\u1A351b!<z'\u8128 5j\u7C2CI(sG(x>\uA89A+b\uC4D1me6&\u2DB9rm7k\u7625Zhd[");
    }


}
