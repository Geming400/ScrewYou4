package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.NoticeDialog.class)
public class NoticeDialog_1814274180Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1095180858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095180858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_678814204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678814204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1852536921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852536921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void action_837918266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837918266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common__1217845563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217845563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainActions()Ljava/util/List;", cancellable = true)
    private void mainActions__854356301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854356301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__744839393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744839393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCancel()Ljava/util/Optional;", cancellable = true)
    private void onCancel_2059735601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059735601L))
            info.setReturnValue(null);
    }


}
