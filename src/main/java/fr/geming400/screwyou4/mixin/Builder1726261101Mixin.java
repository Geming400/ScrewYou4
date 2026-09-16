package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineEditBox.Builder.class)
public class Builder1726261101Mixin {
        @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/client/gui/Font;IILnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/MultiLineEditBox;", cancellable = true)
    private void build_1510759724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510759724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setY__1360421429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360421429L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setX_310092140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310092140L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setCursorColor(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setCursorColor__1448053353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448053353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShowBackground(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setShowBackground_1936131908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936131908L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setShowDecorations(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setShowDecorations_1237947181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237947181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlaceholder(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setPlaceholder__770943656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770943656L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setTextColor(I)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setTextColor_1982857454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982857454L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setTextShadow(Z)Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private void setTextShadow_124529250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124529250L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }


}
