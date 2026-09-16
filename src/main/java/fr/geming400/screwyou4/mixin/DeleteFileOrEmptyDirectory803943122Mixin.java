package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.DeleteFileOrEmptyDirectory.class)
public class DeleteFileOrEmptyDirectory803943122Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__104683146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104683146L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/lang/String;", cancellable = true)
    private void target__805768916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805768916L))
            info.setReturnValue(";f8[`NBa\u38B3`\uB397I \u2AE1:Px\uC3E4\u5F4F<\u0A2Cw7!nA!WgkU,Oh7[\uD2C6_1Az+P_=iflx)6M,Er%l]\"\u2DF9QE\uC888IJ#sWlphE");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1574366647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574366647L))
            info.setReturnValue("\u1E42us\u4816'YO[ 3Ofotk\uC098CM3w5K\u7DF8-d\"mmo\uC4918@\uA0C6i8635");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1361295213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361295213L))
            info.setReturnValue(41691527);
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__1307275134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1307275134L))
            info.cancel();
    }


}
