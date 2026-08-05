package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Range.class)
public class Range1195566605Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_60106134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60106134L))
            info.setReturnValue("*\u182F&bBo:W1xm\uA858\u1273ckA'4l^ef?0 1%r\u6355e[\u821CMeG\"j'c[%vBvI0@");
    }

    @Inject(at = @At("HEAD"), method = "floor()I", cancellable = true)
    private void floor_1233828851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233828851L))
            info.setReturnValue(1266634033);
    }

    @Inject(at = @At("HEAD"), method = "ceiling()I", cancellable = true)
    private void ceiling_1233828851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233828851L))
            info.setReturnValue(1266634033);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight__975005182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975005182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1233828851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233828851L))
            info.setReturnValue(1266634033);
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__975005182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975005182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling__975005182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975005182L))
            info.setReturnValue(null);
    }


}
