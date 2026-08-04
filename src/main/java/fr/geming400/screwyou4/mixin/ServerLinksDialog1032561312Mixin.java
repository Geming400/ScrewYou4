package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ServerLinksDialog.class)
public class ServerLinksDialog1032561312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1876893725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876893725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__102898663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102898663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1070824054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070824054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common__1999558430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999558430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1526552260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526552260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_1070823558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070823558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction_1278022734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278022734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonWidth()I", cancellable = true)
    private void buttonWidth_1070823558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070823558L))
            info.setReturnValue(null);
    }


}
