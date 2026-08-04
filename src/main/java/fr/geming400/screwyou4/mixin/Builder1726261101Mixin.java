package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineEditBox.Builder.class)
public class Builder1726261101Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/gui/Font;IILnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/MultiLineEditBox;", cancellable = true)
    private void build_1349940698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349940698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTextColor(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setTextColor_1989162338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989162338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTextShadow(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setTextShadow__2085077135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085077135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlaceholder(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setPlaceholder_1078157991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078157991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCursorColor(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setCursorColor_1989162338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989162338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShowDecorations(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setShowDecorations__2085077135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085077135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShowBackground(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setShowBackground__2085077135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085077135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setY_1989162338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989162338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setX_1989162338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989162338L))
            info.setReturnValue(null);
    }


}
