package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.DeleteFileOrEmptyDirectory.class)
public class DeleteFileOrEmptyDirectory803943122Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2105511915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105511915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/lang/String;", cancellable = true)
    private void target__331517349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331517349L))
            info.setReturnValue("*!)7AR%PhYzm'1_)KJr:s]$ Rq1 pvC\"bl0@p}Dw縷V䔔zg鯎䛔 Zⱜ侇BJOtrvG\"BG/PYO첃q%7o:SE봤穠㵕ixH75d,5왮?崽");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__331516853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331516853L))
            info.setReturnValue("UUXR(佞}yT>Fꯌb/}&rmuypU?MzUlq6w汭A}&RM6I\"|<t|P}UQgSeT枢AWE=鹊=꛶fRc麪$)4x兌)>#_P{v#_(n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_842205864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842205864L))
            info.setReturnValue(-2074313696);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__982242057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-982242057L))
            info.cancel();
    }


}
