package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Checkbox.Builder.class)
public class Builder_1643830628Mixin {
        @Inject(at = @At("HEAD"), method = "pos(II)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void pos__820646718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820646718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/Checkbox;", cancellable = true)
    private void build_2067574553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067574553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxWidth(I)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void maxWidth__1223769847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223769847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selected(Lnet/minecraft/client/OptionInstance;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void selected_456246213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456246213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selected(Z)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void selected_315443736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315443736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onValueChange(Lnet/minecraft/client/gui/components/Checkbox$OnValueChange;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void onValueChange__2098587991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098587991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/components/Tooltip;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private void tooltip__1092111943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092111943L))
            info.setReturnValue(null);
    }


}
