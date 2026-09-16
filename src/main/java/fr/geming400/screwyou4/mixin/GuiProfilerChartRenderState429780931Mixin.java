package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiProfilerChartRenderState.class)
public class GuiProfilerChartRenderState429780931Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__478845337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478845337L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1200204456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200204456L))
            info.setReturnValue("qt6bB6\u40FF5x\"y=\u03D5,oXA}_\u47E2\u712D5o\">\u6BF0\"J;\u295D)h\u8398I}tLr,6G3 #m[:fJ&n.2M\u15A8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_987133022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987133022L))
            info.setReturnValue(-1917336090);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1993937060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993937060L))
            info.setReturnValue(8.789014E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__2037151418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037151418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_997130896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997130896L))
            info.setReturnValue(-231362377);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1884634577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884634577L))
            info.setReturnValue(-598150539);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_968501745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968501745L))
            info.setReturnValue(517677796);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1856005426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856005426L))
            info.setReturnValue(-997964601);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__2095119374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095119374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chartData()Ljava/util/List;", cancellable = true)
    private void chartData__2122180965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122180965L))
            info.setReturnValue(null);
    }


}
