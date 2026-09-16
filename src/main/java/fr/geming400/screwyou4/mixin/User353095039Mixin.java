package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.User.class)
public class User353095039Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1535751863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535751863L))
            info.setReturnValue(")\u33C107FM03\u6A25{I[XUTrzN \u9A32LJFHl0$*cQN\uAD7Bv6S\u34EA7:*bOR1S!34/[scgc&]`\u2A24N)0\u22B7O:3v\u0910N>|GY#5x\uBDFA");
    }

    @Inject(at = @At("HEAD"), method = "getSessionId()Ljava/lang/String;", cancellable = true)
    private void getSessionId__2121251229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121251229L))
            info.setReturnValue("3A&;\u5112GpTN!,3:\uC935=1ul1m-88vRQ\u6F51T\" %DGg\u2315n>v<xp,\u3C8F?ro\uC615l\u4E8EG>%jOH\"\uB870GYt\u8C89\u4858*(eOYv81<\uC1D8`o9\u6E73o[Q6;");
    }

    @Inject(at = @At("HEAD"), method = "getXuid()Ljava/util/Optional;", cancellable = true)
    private void getXuid__393122181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393122181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfileId()Ljava/util/UUID;", cancellable = true)
    private void getProfileId_1505833600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1505833600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccessToken()Ljava/lang/String;", cancellable = true)
    private void getAccessToken__1140408953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140408953L))
            info.setReturnValue("v!(k.Ip\u7BC0t4\u3BE0\u7D8A1|;H\u2887#\u23CBkl3od\uAD6Em\u8516|^ib<Gc\uBE73+c#&MIt4RW\u5B4Em_N!76\u21A6_,|+\uD5AARs<^  {I0-eaOLc|\u28F2%KZh\u6E54/eW{:c5yhHKs,KK;m");
    }

    @Inject(at = @At("HEAD"), method = "getClientId()Ljava/util/Optional;", cancellable = true)
    private void getClientId_1320959721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320959721L))
            info.setReturnValue(null);
    }


}
