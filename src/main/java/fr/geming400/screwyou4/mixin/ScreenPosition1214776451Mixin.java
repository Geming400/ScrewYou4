package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenPosition.class)
public class ScreenPosition1214776451Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_306150183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306150183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1985199976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985199976L))
            info.setReturnValue("]:v\u4FEE\u5A523\uD562_UX`v[5/C+X\uC4E7\uD4D8\u8BB4zkEg\u33B6<KFh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1772128542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772128542L))
            info.setReturnValue(-1540953248);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/gui/navigation/ScreenAxis;II)Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private static void of_1452118729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452118729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_393569521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393569521L))
            info.setReturnValue(-904385228);
    }

    @Inject(at = @At("HEAD"), method = "step(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private void step_1462266174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462266174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_422198672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422198672L))
            info.setReturnValue(749316156);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getCoordinate_2068625734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068625734L))
            info.setReturnValue(-1038525411);
    }


}
