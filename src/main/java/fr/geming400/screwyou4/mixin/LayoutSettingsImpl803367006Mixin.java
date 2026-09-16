package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl.class)
public class LayoutSettingsImpl803367006Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void copy__1568602233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568602233L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void copy__1497994122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497994122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "align(FF)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void align_1015659287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1015659287L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "align(FF)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void align_383763174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383763174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding__999686904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999686904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding_1936092309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936092309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(II)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding_422311107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422311107L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "padding(IIII)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding_2119303194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119303194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(II)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void padding_431091898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431091898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding(IIII)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void padding__1999902365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999902365L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "getExposed()Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void getExposed_35836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35836L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingBottom(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingBottom_811428829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811428829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingBottom(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingBottom__33133600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33133600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingRight(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingRight__1920468530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920468530L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingRight(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingRight__1221703281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221703281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingLeft(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingLeft_277310716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277310716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingLeft(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingLeft__607765183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607765183L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "alignVertically(F)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void alignVertically__964774615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964774615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignVertically(F)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void alignVertically_405578740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405578740L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingHorizontal(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingHorizontal_2015984260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015984260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingHorizontal(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingHorizontal_167299225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167299225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingVertical(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingVertical_1175784242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175784242L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }

    @Inject(at = @At("HEAD"), method = "paddingVertical(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingVertical__1468855637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468855637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignHorizontally(F)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void alignHorizontally__360070505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360070505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignHorizontally(F)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void alignHorizontally_1773048774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773048774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingTop(I)Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void paddingTop_270631880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270631880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paddingTop(I)Lnet/minecraft/client/gui/layouts/LayoutSettings$LayoutSettingsImpl;", cancellable = true)
    private void paddingTop__280020235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280020235L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.LayoutSettings.LayoutSettingsImpl());
    }


}
