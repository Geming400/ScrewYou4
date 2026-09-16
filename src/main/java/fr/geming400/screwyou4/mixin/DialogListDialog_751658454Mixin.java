package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.DialogListDialog.class)
public class DialogListDialog_751658454Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__156967815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156967815L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1522081978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522081978L))
            info.setReturnValue("7d0:Mk;6dAVBA\u55C0X-s76GNrh4AvD\u9332+PE2c|!,kS\u0E373NwU\"XSi%*k\u4CCD\u7F7A9+x{fC^zGK\u12E0/zl+K4[|7r<N0+b\u6A19S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1309010544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309010544L))
            info.setReturnValue(162200784);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_34219330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34219330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1818103707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818103707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction_202150007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202150007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dialogs()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void dialogs__302068524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302068524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_1144980990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144980990L))
            info.setReturnValue(322775081);
    }

    @Inject(at = @At("HEAD"), method = "buttonWidth()I", cancellable = true)
    private void buttonWidth_1764025991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764025991L))
            info.setReturnValue(578571434);
    }


}
