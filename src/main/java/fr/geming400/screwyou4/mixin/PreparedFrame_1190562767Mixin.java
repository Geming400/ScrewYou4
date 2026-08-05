package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRenderDispatcher.PreparedFrame.class)
public class PreparedFrame_1190562767Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__924012663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-924012663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeTranslucentAfterTerrain()V", cancellable = true)
    private void executeTranslucentAfterTerrain__65511388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-65511388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnyOutline()Z", cancellable = true)
    private void hasAnyOutline_1349983381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349983381L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyAlwaysOnTop()Z", cancellable = true)
    private void hasAnyAlwaysOnTop__2123806512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123806512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "executeTranslucent()V", cancellable = true)
    private void executeTranslucent__463801251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-463801251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeSolid()V", cancellable = true)
    private void executeSolid__1893587957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1893587957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeAlwaysOnTop()V", cancellable = true)
    private void executeAlwaysOnTop__60908977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-60908977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeOutline()V", cancellable = true)
    private void executeOutline__790681708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-790681708L))
            info.cancel();
    }


}
