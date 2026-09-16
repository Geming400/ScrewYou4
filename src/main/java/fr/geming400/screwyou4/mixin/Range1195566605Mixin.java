package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Range.class)
public class Range1195566605Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1965989634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965989634L))
            info.setReturnValue("x1V.F+=0.,\u72195Er1fw2\u96A22F");
    }

    @Inject(at = @At("HEAD"), method = "floor()I", cancellable = true)
    private void floor__391430297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391430297L))
            info.setReturnValue(-1974266822);
    }

    @Inject(at = @At("HEAD"), method = "ceiling()I", cancellable = true)
    private void ceiling__964528810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964528810L))
            info.setReturnValue(596921643);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_110218028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110218028L))
            info.setReturnValue(1883726668);
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__882963988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882963988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling_1681755419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681755419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight__1324336187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324336187L))
            info.setReturnValue(null);
    }


}
