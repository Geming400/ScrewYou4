package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.GpuWarnlistManager.class)
public class GpuWarnlistManager_1366883933Mixin {
        @Inject(at = @At("HEAD"), method = "showWarning()V", cancellable = true)
    private void showWarning__2085858672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2085858672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "willShowWarning()Z", cancellable = true)
    private void willShowWarning_1304588678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304588678L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAllWarnings()Ljava/lang/String;", cancellable = true)
    private void getAllWarnings_1529118791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529118791L))
            info.setReturnValue("A_*J\uFD42;uH8dU:U\u7F3B|S\u0525LA0%3\u30E7D\uA3E0M}6\u736C\u3310AC?6Fg}+[\u6EBAx$^o46:{j9$T/PmL{!@Y5w)P>+Kewxb");
    }

    @Inject(at = @At("HEAD"), method = "isShowingWarning()Z", cancellable = true)
    private void isShowingWarning_1431953618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431953618L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRendererWarnings()Ljava/lang/String;", cancellable = true)
    private void getRendererWarnings_1559607189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559607189L))
            info.setReturnValue("=#\u222D$<U3pw.}G8\u3831njuHJZ:rK+n\"\uB13DLt-3\u3452:q-&TV4}-j+7<-xR\uAC66\u1DB478\uBC3DIx'BU\u630Ds8OE\u8181KC|,]h@l^K");
    }

    @Inject(at = @At("HEAD"), method = "getVendorWarnings()Ljava/lang/String;", cancellable = true)
    private void getVendorWarnings__1413584166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413584166L))
            info.setReturnValue("( )G8||@Zn\uF912Wk#I\"\u2A3C-;\uA972OypWd;`W[{UjYYjfcd\u84F1&'{,;RnhT^\u223FLX)]\uB809M[L\u56F5Nb?z|o'cfgdY^\uAAAAq|q=\u9DE2\u9A59");
    }

    @Inject(at = @At("HEAD"), method = "dismissWarning()V", cancellable = true)
    private void dismissWarning__1808122211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1808122211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVersionWarnings()Ljava/lang/String;", cancellable = true)
    private void getVersionWarnings__388156354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388156354L))
            info.setReturnValue("b-n8xru2:");
    }

    @Inject(at = @At("HEAD"), method = "resetWarnings()V", cancellable = true)
    private void resetWarnings__1908258295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1908258295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWarnings()Z", cancellable = true)
    private void hasWarnings_934745506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934745506L))
            info.setReturnValue(true);
    }


}
