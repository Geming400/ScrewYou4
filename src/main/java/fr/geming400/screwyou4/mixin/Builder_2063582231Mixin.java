package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PopupScreen.Builder.class)
public class Builder_2063582231Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/PopupScreen;", cancellable = true)
    private void build__889614647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889614647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClose(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void onClose_194281605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194281605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMessage(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void addMessage_578067822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578067822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addButton(Lnet/minecraft/network/chat/Component;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void addButton_1248855177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248855177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setImage(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void setImage__1240329265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240329265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWidth(I)Lnet/minecraft/client/gui/components/PopupScreen$Builder;", cancellable = true)
    private void setWidth_1721248573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721248573L))
            info.setReturnValue(null);
    }


}
