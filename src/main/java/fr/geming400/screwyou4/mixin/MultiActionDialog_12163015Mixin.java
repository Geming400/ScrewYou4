package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.MultiActionDialog.class)
public class MultiActionDialog_12163015Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__896463254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896463254L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_782586539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782586539L))
            info.setReturnValue("KM(#r$jw]l-u\u81F7=mZk'0\u86C0M/CB#Y/29E\u45E3\u8C67n?<`/6ty*\u7A09&#+\u7B1F\u4B18\u61FDz8\"\u7698z1&w.A+)?|6J7BffS\u285ArS,\u15D2Q<;</=efkX|\u884D%}n\u33A6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_569515105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569515105L))
            info.setReturnValue(2039426211);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common__705276109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705276109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actions()Ljava/util/List;", cancellable = true)
    private void actions__1264554381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264554381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1078608268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078608268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitAction()Ljava/util/Optional;", cancellable = true)
    private void exitAction__537345432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537345432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columns()I", cancellable = true)
    private void columns_405485551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405485551L))
            info.setReturnValue(-156903965);
    }


}
