package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Line.class)
public class Line346837132Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1117260161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117260161L))
            info.setReturnValue("HEIHj{`Q\u17A8`>n7\uC75Dia\u24AFa7L=z=|L\uFCDCCp6`]V\u79D2Y9!h\u934DZy:o\u9EBB\u1B0AR%]}hQ2IF\uFEC7<K/}6 \u565Cy_");
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__1731693461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731693461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling_833025946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833025946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight_2121901636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121901636L))
            info.setReturnValue(null);
    }


}
