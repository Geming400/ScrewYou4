package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.MusicToastDisplayState.class)
public class MusicToastDisplayState_311786731Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/MusicToastDisplayState;", cancellable = true)
    private static void values_572612652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572612652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/MusicToastDisplayState;", cancellable = true)
    private static void valueOf__1690867505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690867505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__1865122435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865122435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__823673741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823673741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void tooltip__1865122435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865122435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderInPauseScreen()Z", cancellable = true)
    private void renderInPauseScreen_350065313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350065313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderToast()Z", cancellable = true)
    private void renderToast_350065313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350065313L))
            info.setReturnValue(null);
    }


}
