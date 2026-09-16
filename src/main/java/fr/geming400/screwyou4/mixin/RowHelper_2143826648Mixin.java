package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.GridLayout.RowHelper.class)
public class RowHelper_2143826648Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;ILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1479508886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479508886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_202842633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202842633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;I)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_32552944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32552944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__2121742223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121742223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings__827846849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827846849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting_451925015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451925015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGrid()Lnet/minecraft/client/gui/layouts/GridLayout;", cancellable = true)
    private void getGrid__1083479995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083479995L))
            info.setReturnValue(null);
    }


}
