package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.ApplyInFolders.class)
public class ApplyInFolders1791614490Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_882988222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882988222L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1732929281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732929281L))
            info.setReturnValue("dCDXiA\u78A7w1qr8w\u9B9B8A2D8vip_Cs\u82D8-\u639A_p,}yV\u0935<NxwID?nX\u60E0C4`/({UN:?R\"\u321Aho#+-D\u5719\"fe\uB14B;r@F!k2}ez\u9CDAAGI9@q'-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1946000715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946000715L))
            info.setReturnValue(-694632780);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__319603766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-319603766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fileFixOperations()Ljava/util/List;", cancellable = true)
    private void fileFixOperations_1237329295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237329295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "folders()Lnet/minecraft/util/filefix/access/FileRelation;", cancellable = true)
    private void folders__605387527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605387527L))
            info.setReturnValue(null);
    }


}
