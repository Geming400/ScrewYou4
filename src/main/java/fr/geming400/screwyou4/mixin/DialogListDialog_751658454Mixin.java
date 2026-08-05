package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.DialogListDialog.class)
public class DialogListDialog_751658454Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2137170712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137170712L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__383801522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-383801522L))
            info.setReturnValue("f0_078ZV.R.aA\uAE4BO\u7658S@l@)sV74\uB84F^*\uA244e$4zv\"SJ;\u98598d;91/xG]w\u1034!R8\u6150");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_789921195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789921195L))
            info.setReturnValue(-1981813190);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_2014506007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014506007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dialogs()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void dialogs__1923355799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923355799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction_997119875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997119875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1807455119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807455119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_789920699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789920699L))
            info.setReturnValue(-1778665771);
    }

    @Inject(at = @At("HEAD"), method = "buttonWidth()I", cancellable = true)
    private void buttonWidth_789920699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789920699L))
            info.setReturnValue(-1778665771);
    }


}
