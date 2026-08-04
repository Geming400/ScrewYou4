package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PopupScreen.Builder.class)
public class Builder_2063582231Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/PopupScreen;", cancellable = true)
    private void build__1980421001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980421001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClose(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void onClose_918417086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918417086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMessage(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void addMessage_118974292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118974292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void setWidth__243627079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243627079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addButton(Lnet/minecraft/network/chat/Component;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void addButton_876373334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876373334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setImage(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void setImage_1398066888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398066888L))
            info.setReturnValue(null);
    }


}
