package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServer.class)
public class LanServer_1013929202Mixin {
        @Inject(at = @At("HEAD"), method = "getAddress()Ljava/lang/String;", cancellable = true)
    private void getAddress__945100360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945100360L))
            info.setReturnValue("$ez[\"m+&?iFN\uC2CD }}s7\uB74DN]p&\u1EB7\u6DF0O5\uABE4p+s\u93FCwXf");
    }

    @Inject(at = @At("HEAD"), method = "getMotd()Ljava/lang/String;", cancellable = true)
    private void getMotd__1635908990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635908990L))
            info.setReturnValue("M3\u1254s8)^BX<W\"\u5F6D\u24B4e,V]xBYinj\uA454*\uA153n3\uFE8EJuB\uFA7E>r\uA5E4\u10BF`4(1sQd51Vp3Q%EhmMsV-\u136Ar$y\u50D5=l\u8D87%\u5D29\u9BB4*`");
    }

    @Inject(at = @At("HEAD"), method = "updatePingTime()V", cancellable = true)
    private void updatePingTime_1959142748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1959142748L))
            info.cancel();
    }


}
