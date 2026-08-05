package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.CommonDialogData.class)
public class CommonDialogData788072665Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__120553603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120553603L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1558496190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558496190L))
            info.setReturnValue("L%&5pm`TnM{'_wIu=\"C$k}O.iL?^{{hB?'yl'ym>\u8DE7e`L>Gv66ES>;4wB4h=2#h\uB3CBVE]} ]\u9D9A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1345424756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345424756L))
            info.setReturnValue(-527182265);
    }

    @Inject(at = @At("HEAD"), method = "body()Ljava/util/List;", cancellable = true)
    private void body__1265890389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265890389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inputs()Ljava/util/List;", cancellable = true)
    private void inputs__445281678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445281678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pause()Z", cancellable = true)
    private void pause_687882842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687882842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canCloseWithEscape()Z", cancellable = true)
    private void canCloseWithEscape__507609887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507609887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "externalTitle()Ljava/util/Optional;", cancellable = true)
    private void externalTitle_863508692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863508692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeExternalTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void computeExternalTitle__1777718206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777718206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "afterAction()Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private void afterAction_1315523052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315523052L))
            info.setReturnValue(net.minecraft.server.dialog.DialogAction.CLOSE);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1174422076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174422076L))
            info.setReturnValue(null);
    }


}
