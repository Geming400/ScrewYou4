package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.DebugScreenOverlay.class)
public class DebugScreenOverlay549535467Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1179901521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179901521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logFrameDuration(J)V", cancellable = true)
    private void logFrameDuration__971819755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-971819755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFpsCharts()Z", cancellable = true)
    private void showFpsCharts__1140071135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140071135L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showNetworkCharts()Z", cancellable = true)
    private void showNetworkCharts_711332924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711332924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showLightmapTexture()Z", cancellable = true)
    private void showLightmapTexture__1220988246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220988246L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBandwidthLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getBandwidthLogger__886252022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886252022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTickTimeLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getTickTimeLogger__1993385627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993385627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPingLogger()Lnet/minecraft/util/debugchart/LocalSampleLogger;", cancellable = true)
    private void getPingLogger__1523577347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523577347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logRemoteSample([JLnet/minecraft/util/debugchart/RemoteDebugSampleType;)V", cancellable = true)
    private void logRemoteSample_1530184372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1530184372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_413279789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(413279789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleLightmapTexture()V", cancellable = true)
    private void toggleLightmapTexture_1309504125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309504125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleProfilerChart()V", cancellable = true)
    private void toggleProfilerChart__134550595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-134550595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleFpsCharts()V", cancellable = true)
    private void toggleFpsCharts_1620955700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1620955700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleNetworkCharts()V", cancellable = true)
    private void toggleNetworkCharts__18997809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18997809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProfilerPieChart()Lnet/minecraft/client/gui/components/debugchart/ProfilerPieChart;", cancellable = true)
    private void getProfilerPieChart_267427700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267427700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showProfilerChart()Z", cancellable = true)
    private void showProfilerChart_595780138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595780138L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showDebugScreen()Z", cancellable = true)
    private void showDebugScreen__1020957568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020957568L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clearChunkCache()V", cancellable = true)
    private void clearChunkCache_1355911068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355911068L))
            info.cancel();
    }


}
