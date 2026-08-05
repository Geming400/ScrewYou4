package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Checkbox.Builder.class)
public class Builder_1643830628Mixin {
        @Inject(at = @At("HEAD"), method = "pos(II)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void pos_1741244694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741244694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/Checkbox;", cancellable = true)
    private void build__488522233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488522233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxWidth(I)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void maxWidth__1505507065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505507065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onValueChange(Lnet/minecraft/client/gui/components/Checkbox$OnValueChange;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void onValueChange__1555359157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555359157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selected(Z)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void selected__1623967075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623967075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selected(Lnet/minecraft/client/OptionInstance;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void selected_2031195594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2031195594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/components/Tooltip;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void tooltip_1122520150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122520150L))
            info.setReturnValue(null);
    }


}
