package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.GpuWarnlistManager.class)
public class GpuWarnlistManager_1366883933Mixin {
        @Inject(at = @At("HEAD"), method = "showWarning()V", cancellable = true)
    private void showWarning_1405158671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405158671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "willShowWarning()Z", cancellable = true)
    private void willShowWarning_1405162515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405162515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAllWarnings()Ljava/lang/String;", cancellable = true)
    private void getAllWarnings_231423461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231423461L))
            info.setReturnValue("`oP;N\"7瑮30$-}F!2?3.柈NU.&td'D/{");
    }

    @Inject(at = @At("HEAD"), method = "hasWarnings()Z", cancellable = true)
    private void hasWarnings_1405162515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405162515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetWarnings()V", cancellable = true)
    private void resetWarnings_1405158671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405158671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVendorWarnings()Ljava/lang/String;", cancellable = true)
    private void getVendorWarnings_231423461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231423461L))
            info.setReturnValue("`oP;N\"7瑮30$-}F!2?3.柈NU.&td'D/{");
    }

    @Inject(at = @At("HEAD"), method = "getVersionWarnings()Ljava/lang/String;", cancellable = true)
    private void getVersionWarnings_231423461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231423461L))
            info.setReturnValue("`oP;N\"7瑮30$-}F!2?3.柈NU.&td'D/{");
    }

    @Inject(at = @At("HEAD"), method = "dismissWarning()V", cancellable = true)
    private void dismissWarning_1405158671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405158671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isShowingWarning()Z", cancellable = true)
    private void isShowingWarning_1405162515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405162515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRendererWarnings()Ljava/lang/String;", cancellable = true)
    private void getRendererWarnings_231423461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231423461L))
            info.setReturnValue("`oP;N\"7瑮30$-}F!2?3.柈NU.&td'D/{");
    }


}
