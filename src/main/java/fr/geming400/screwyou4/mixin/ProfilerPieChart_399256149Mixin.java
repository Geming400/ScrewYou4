package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debugchart.ProfilerPieChart.class)
public class ProfilerPieChart_399256149Mixin {
        @Inject(at = @At("HEAD"), method = "profilerPieChartKeyPress(I)V", cancellable = true)
    private void profilerPieChartKeyPress_1976085823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1976085823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPieChartResults(Lnet/minecraft/util/profiling/ProfileResults;)V", cancellable = true)
    private void setPieChartResults__757072527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-757072527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState_263000470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(263000470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBottomOffset(I)V", cancellable = true)
    private void setBottomOffset_1170433440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1170433440L))
            info.cancel();
    }


}
