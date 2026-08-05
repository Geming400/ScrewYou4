package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ServerLinksDialog.class)
public class ServerLinksDialog1032561312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_123935044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123935044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1802984837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802984837L))
            info.setReturnValue("!AG\u526D\uA502.i\u34C3}D{\u6C2CG9G0}2\uCAA1\uA2BBv2a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1589913403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589913403L))
            info.setReturnValue(1346786389);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_315122189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315122189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction_483052866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483052866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonWidth()I", cancellable = true)
    private void buttonWidth_2044928850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044928850L))
            info.setReturnValue(-1187833087);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2099006566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099006566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_1425883849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425883849L))
            info.setReturnValue(-511248226);
    }


}
