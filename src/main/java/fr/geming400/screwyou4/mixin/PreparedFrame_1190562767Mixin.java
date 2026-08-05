package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRenderDispatcher.PreparedFrame.class)
public class PreparedFrame_1190562767Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAnyOutline()Z", cancellable = true)
    private void hasAnyOutline_1228841349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228841349L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyAlwaysOnTop()Z", cancellable = true)
    private void hasAnyAlwaysOnTop_1228841349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228841349L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "executeSolid()V", cancellable = true)
    private void executeSolid_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeAlwaysOnTop()V", cancellable = true)
    private void executeAlwaysOnTop_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeOutline()V", cancellable = true)
    private void executeOutline_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeTranslucent()V", cancellable = true)
    private void executeTranslucent_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeTranslucentAfterTerrain()V", cancellable = true)
    private void executeTranslucentAfterTerrain_1228837505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228837505L))
            info.cancel();
    }


}
