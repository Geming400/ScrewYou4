package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.DebugScreenOverlay.class)
public class DebugScreenOverlay549535467Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState__138379821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-138379821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleNetworkCharts()V", cancellable = true)
    private void toggleNetworkCharts_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleLightmapTexture()V", cancellable = true)
    private void toggleLightmapTexture_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleFpsCharts()V", cancellable = true)
    private void toggleFpsCharts_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleProfilerChart()V", cancellable = true)
    private void toggleProfilerChart_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showProfilerChart()Z", cancellable = true)
    private void showProfilerChart_587814050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587814050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProfilerPieChart()Lnet/minecraft/client/gui/components/debugchart/ProfilerPieChart;", cancellable = true)
    private void getProfilerPieChart_305032453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305032453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showDebugScreen()Z", cancellable = true)
    private void showDebugScreen_587814050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587814050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearChunkCache()V", cancellable = true)
    private void clearChunkCache_587810206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587810206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logRemoteSample([JLnet/minecraft/util/debugchart/RemoteDebugSampleType;)V", cancellable = true)
    private void logRemoteSample__639039040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-639039040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTickTimeLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getTickTimeLogger__330007403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330007403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showNetworkCharts()Z", cancellable = true)
    private void showNetworkCharts_587814050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587814050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showLightmapTexture()Z", cancellable = true)
    private void showLightmapTexture_587814050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587814050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPingLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getPingLogger__330007403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330007403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showFpsCharts()Z", cancellable = true)
    private void showFpsCharts_587814050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587814050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBandwidthLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getBandwidthLogger__330007403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330007403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logFrameDuration(J)V", cancellable = true)
    private void logFrameDuration_1764375960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1764375960L))
            info.cancel();
    }


}
