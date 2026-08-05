package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixerUpper.UpgradeInProgress.class)
public class UpgradeInProgress_1472954226Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1436500812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436500812L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_337494250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337494250L))
            info.setReturnValue("GeEljK\u1CDC%#YRW=V<HxfmC&B1t\uCA40'2\u353Faae/\uFCE1\uA782^x0Z&e\uC9697\"Feq\uB18F3\uC533:DO1t\"3\u5717h\uB7F4|kmg*M|P#Ojmf\u1CDB[\uCE44Cx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1511216967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511216967L))
            info.setReturnValue(-237396598);
    }

    @Inject(at = @At("HEAD"), method = "moves()Ljava/util/List;", cancellable = true)
    private void moves__1195676255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195676255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/nio/file/Path;Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1366990927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366990927L))
            info.setReturnValue(null);
    }


}
