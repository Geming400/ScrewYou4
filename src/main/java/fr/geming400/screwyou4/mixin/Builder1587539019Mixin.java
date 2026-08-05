package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Button.Builder.class)
public class Builder1587539019Mixin {
        @Inject(at = @At("HEAD"), method = "size(II)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void size__256425572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256425572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds(IIII)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void bounds__1185535248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185535248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos(II)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void pos_430569007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430569007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/Button;", cancellable = true)
    private void build__1152953696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152953696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void width_456467420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456467420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/components/Tooltip;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void tooltip_993053039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993053039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNarration(Lnet/minecraft/client/gui/components/Button$CreateNarration;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void createNarration__328397541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328397541L))
            info.setReturnValue(null);
    }


}
