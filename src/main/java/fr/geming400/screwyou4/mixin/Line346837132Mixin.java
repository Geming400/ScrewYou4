package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Line.class)
public class Line346837132Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__788623339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788623339L))
            info.setReturnValue(";VRwR+! P\"6hjpT;JcV7?Rf5ჟVclA':P;xGHJ<=ᾧN,of。+Eo!dPm#Q,멙؆L 7Wx");
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight__1823734655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823734655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__1823734655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823734655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling__1823734655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823734655L))
            info.setReturnValue(null);
    }


}
