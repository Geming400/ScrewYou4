package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl.class)
public class LayoutSettingsImpl803367006Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void copy_83412242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83412242L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void copy_738516171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738516171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "align(FF)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void align__660468142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-660468142L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "align(FF)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void align_1368890251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368890251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "padding(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(II)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding__1264197134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264197134L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "padding(IIII)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding__753388789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753388789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(II)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding_1201286123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201286123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(IIII)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding_763315922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763315922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExposed()Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void getExposed_83412242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83412242L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingBottom(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingBottom_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingBottom(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingBottom__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingLeft(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingLeft_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingLeft(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingLeft__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingRight(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingRight__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingRight(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingRight_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignHorizontally(F)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void alignHorizontally_1670778716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670778716L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "alignHorizontally(F)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void alignHorizontally__852397375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852397375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingVertical(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingVertical__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingVertical(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingVertical_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignVertically(F)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void alignVertically_1670778716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670778716L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "alignVertically(F)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void alignVertically__852397375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852397375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingHorizontal(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingHorizontal__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingHorizontal(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingHorizontal_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingTop(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingTop_1960937284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960937284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingTop(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingTop__361353735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361353735L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings$LayoutSettingsImpl());
    }


}
