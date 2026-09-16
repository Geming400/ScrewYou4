package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineTextWidget.class)
public class MultiLineTextWidget714144656Mixin {
        @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1223751834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223751834L))
            info.setReturnValue(-1164465262);
    }

    @Inject(at = @At("HEAD"), method = "visitLines(Lnet/minecraft/client/gui/ActiveTextCollector;)V", cancellable = true)
    private void visitLines__64691992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-64691992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxRows(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxRows_1522687679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522687679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCentered(Z)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setCentered_942783915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942783915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxWidth_527650728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527650728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1011472519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011472519L))
            info.setReturnValue(1572812996);
    }


}
