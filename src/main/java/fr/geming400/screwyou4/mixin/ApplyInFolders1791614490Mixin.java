package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.ApplyInFolders.class)
public class ApplyInFolders1791614490Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1117840547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117840547L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_656154515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656154515L))
            info.setReturnValue("R dWk?7$!m\u4357taE>`YY@Dx%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1829877232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829877232L))
            info.setReturnValue(-1744217501);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix_5429311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(5429311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fileFixOperations()Ljava/util/List;", cancellable = true)
    private void fileFixOperations__877015990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877015990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "folders()Lnet/minecraft/util/filefix/access/FileRelation;", cancellable = true)
    private void folders_1696594868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696594868L))
            info.setReturnValue(null);
    }


}
