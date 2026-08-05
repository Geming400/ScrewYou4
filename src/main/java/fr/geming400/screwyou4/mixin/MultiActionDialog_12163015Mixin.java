package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.MultiActionDialog.class)
public class MultiActionDialog_12163015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1397675273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397675273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1123296961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123296961L))
            info.setReturnValue("&뭽ɔ<{@SPpe}n#vq\"KUl88oZQeV?{DWv%c砼M #gx䲣oHꛜ)9in䁰HE\"8Es)6u[9R{NEjkF#+/pJ_1䏰@W。8Ax볜/mDf茲cvG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_50425756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50425756L))
            info.setReturnValue(-997152066);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_1275010568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275010568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actions()Ljava/util/List;", cancellable = true)
    private void actions_1638499830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638499830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction_257624436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257624436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1748016738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748016738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_50425260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50425260L))
            info.setReturnValue(-818628577);
    }


}
