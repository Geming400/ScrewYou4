package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FocusableTextWidget.Builder.class)
public class Builder_718474348Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/FocusableTextWidget;", cancellable = true)
    private void build_1157757907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157757907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxWidth(I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void maxWidth_681576965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681576965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundFill(Lnet/minecraft/client/gui/components/FocusableTextWidget$BackgroundFill;)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void backgroundFill_1201985505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201985505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysShowBorder(Z)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void alwaysShowBorder_870792012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870792012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textWidth(I)Lnet/minecraft/client/gui/components/FocusableTextWidget$Builder;", cancellable = true)
    private void textWidth__1454593380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454593380L))
            info.setReturnValue(null);
    }


}
