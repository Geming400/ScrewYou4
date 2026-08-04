package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FocusableTextWidget.Builder.class)
public class Builder_718474348Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/FocusableTextWidget;", cancellable = true)
    private void build__1751905407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751905407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxWidth(I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void maxWidth__1121100605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121100605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textWidth(I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void textWidth__1121100605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121100605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysShowBorder(Z)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void alwaysShowBorder__1013455788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013455788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundFill(Lnet/minecraft/client/gui/components/FocusableTextWidget$BackgroundFill;)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void backgroundFill_22365202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22365202L))
            info.setReturnValue(null);
    }


}
