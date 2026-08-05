package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiProfilerChartRenderState.class)
public class GuiProfilerChartRenderState429780931Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1815293190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815293190L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__705679044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705679044L))
            info.setReturnValue("gJ8斞7&{iZRᦦpgg*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_468043673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468043673L))
            info.setReturnValue(-1984300104);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_468040294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468040294L))
            info.setReturnValue(5.136705E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_1604806235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604806235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_468043177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468043177L))
            info.setReturnValue(-1805776614);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_468043177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468043177L))
            info.setReturnValue(-1805776614);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_468043177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468043177L))
            info.setReturnValue(-1805776614);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_468043177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468043177L))
            info.setReturnValue(-1805776614);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_1604806235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604806235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chartData()Ljava/util/List;", cancellable = true)
    private void chartData_2056117747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056117747L))
            info.setReturnValue(null);
    }


}
