package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debugchart.ProfilerPieChart.class)
public class ProfilerPieChart_399256149Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractRenderState__288659140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-288659140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profilerPieChartKeyPress(I)V", cancellable = true)
    private void profilerPieChartKeyPress_1613173120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1613173120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBottomOffset(I)V", cancellable = true)
    private void setBottomOffset_1613173120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1613173120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPieChartResults(Lnet/minecraft/util/profiling/ProfileResults;)V", cancellable = true)
    private void setPieChartResults__1380924209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1380924209L))
            info.cancel();
    }


}
