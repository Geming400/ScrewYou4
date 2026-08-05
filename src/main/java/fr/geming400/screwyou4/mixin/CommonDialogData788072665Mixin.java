package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.CommonDialogData.class)
public class CommonDialogData788072665Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2121382372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121382372L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__347387310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347387310L))
            info.setReturnValue("l'lrm8xVro^[SDHL 7<\"[<_\u7695sx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_826335407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826335407L))
            info.setReturnValue(-919954275);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/List;", cancellable = true)
    private void body__1880557815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880557815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inputs()Ljava/util/List;", cancellable = true)
    private void inputs__1880557815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880557815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pause()Z", cancellable = true)
    private void pause_826351248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826351248L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1388836500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388836500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "externalTitle()Ljava/util/Optional;", cancellable = true)
    private void externalTitle_1033534087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033534087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canCloseWithEscape()Z", cancellable = true)
    private void canCloseWithEscape_826351248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826351248L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "computeExternalTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void computeExternalTitle__1388836500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388836500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "afterAction()Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private void afterAction_235304506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235304506L))
            info.setReturnValue(net.minecraft.server.dialog.DialogAction.CLOSE);
    }


}
