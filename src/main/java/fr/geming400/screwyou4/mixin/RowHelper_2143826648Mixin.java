package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.GridLayout.RowHelper.class)
public class RowHelper_2143826648Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;ILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_995434927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995434927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__2072625116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072625116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;I)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__502491125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502491125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1186134262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186134262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting_2078846852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078846852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGrid()Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void getGrid_1875180673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875180673L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.GridLayout());
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings_2078846852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078846852L))
            info.setReturnValue(null);
    }


}
