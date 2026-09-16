package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.RegexMove.class)
public class RegexMove928123130Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_19496862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19496862L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1698546655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698546655L))
            info.setReturnValue("Y?\u5742I+L@b#&/ ]CbM+hbicbs\u6A4Bd\uA5B3:g%PQk3!2\u76C2T5#+8\uA608d\u1FB2iO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1485475221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485475221L))
            info.setReturnValue(-467877988);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__1183095126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1183095126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromPattern()Ljava/util/regex/Pattern;", cancellable = true)
    private void fromPattern_417486704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417486704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toReplacement()Ljava/lang/String;", cancellable = true)
    private void toReplacement__1001960998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001960998L))
            info.setReturnValue("YSJke$H{\u6CEC5");
    }


}
