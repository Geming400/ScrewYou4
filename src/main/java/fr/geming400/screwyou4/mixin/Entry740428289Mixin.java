package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ChainedJsonException.Entry.class)
public class Entry740428289Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1510851318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510851318L))
            info.setReturnValue("2pbJ]O.MyJH\uD752R)z\u9B99M.Ue!P.UL=u\u79FF8.m6\u54F0jT-g[lIh\u23AD\u0626b-%Uh\u9405");
    }

    @Inject(at = @At("HEAD"), method = "getJsonKeys()Ljava/lang/String;", cancellable = true)
    private void getJsonKeys__1379426180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379426180L))
            info.setReturnValue("pI7\"zWhey;)uu\u7612N&fZXEI?/*^]\uC1739Pgl2\u0F1DcBggqXq^2fBpC0:/&m2'?\u5CF02=0mb:e=t\uCE15'\u5912p:\uC9F7_\"");
    }

    @Inject(at = @At("HEAD"), method = "getFilename()Ljava/lang/String;", cancellable = true)
    private void getFilename__1999278777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999278777L))
            info.setReturnValue("<*dMK3E\u1F3DF>cR0ue\u72D0<YZg\u55A8<)bIfQ{qsF;/\u5914=d\u5D27F}31et8\u4F49rY%\uBB07Lr<6TnB4ub`iA7\u8FF1.x\u5108JIM`Zu1XbBcR");
    }


}
