package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineTextWidget.class)
public class MultiLineTextWidget714144656Mixin {
        @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_752406902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752406902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_752406902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752406902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxWidth__1382876828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382876828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitLines(Lnet/minecraft/client/gui/ActiveTextCollector;)V", cancellable = true)
    private void visitLines_1684248028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684248028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxRows(I)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setMaxRows__1382876828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382876828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCentered(Z)Lnet/minecraft/client/gui/components/MultiLineTextWidget;", cancellable = true)
    private void setCentered_258122229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258122229L))
            info.setReturnValue(null);
    }


}
