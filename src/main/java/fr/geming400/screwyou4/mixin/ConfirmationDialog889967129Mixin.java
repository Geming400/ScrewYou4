package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ConfirmationDialog.class)
public class ConfirmationDialog889967129Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__18659139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18659139L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1660390654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660390654L))
            info.setReturnValue("]\u254A|w_\u8C6A>\u2A6Di67gdo^\u3D543CWUM%_+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1447319220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447319220L))
            info.setReturnValue(-793615526);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_172528006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172528006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noButton()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void noButton__199539997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199539997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yesButton()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void yesButton__957685495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957685495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCancel()Ljava/util/Optional;", cancellable = true)
    private void onCancel_1147039232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147039232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainActions()Ljava/util/List;", cancellable = true)
    private void mainActions_1391509325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391509325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1956412383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956412383L))
            info.setReturnValue(null);
    }


}
