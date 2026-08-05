package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Button.Builder.class)
public class Builder1587539019Mixin {
        @Inject(at = @At("HEAD"), method = "size(II)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void size_1759745243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759745243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds(IIII)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void bounds_1206041019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206041019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos(II)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void pos_1759745243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759745243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/Button;", cancellable = true)
    private void build_1030709298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030709298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(I)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void width__1950167326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950167326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/components/Tooltip;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void tooltip_226503570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226503570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNarration(Lnet/minecraft/client/gui/components/Button$CreateNarration;)Lnet/minecraft/client/gui/components/Button$Builder;", cancellable = true)
    private void createNarration_798192149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798192149L))
            info.setReturnValue(null);
    }


}
