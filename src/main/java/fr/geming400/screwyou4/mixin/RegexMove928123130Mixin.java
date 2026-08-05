package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.RegexMove.class)
public class RegexMove928123130Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1981331907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981331907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__207336845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207336845L))
            info.setReturnValue("wUH*W^!澴TdE]^%]\"$pu#!`sl;%4/z꣨;m⑂S(发xG+U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_966385872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966385872L))
            info.setReturnValue(1408937141);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__858062049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-858062049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toReplacement()Ljava/lang/String;", cancellable = true)
    private void toReplacement__207337341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207337341L))
            info.setReturnValue("p=痣+TtH^蓾K봠wD&$H湈;:^V[M.%.FcUh8킸A:Xo/䧿J༖E,氁v");
    }

    @Inject(at = @At("HEAD"), method = "fromPattern()Ljava/util/regex/Pattern;", cancellable = true)
    private void fromPattern__162342346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162342346L))
            info.setReturnValue(null);
    }


}
