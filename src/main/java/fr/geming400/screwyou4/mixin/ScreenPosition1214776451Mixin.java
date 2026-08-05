package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenPosition.class)
public class ScreenPosition1214776451Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1694678586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694678586L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_79316476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79316476L))
            info.setReturnValue("jqUej");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1253039193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253039193L))
            info.setReturnValue(910341094);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/gui/navigation/ScreenAxis;II)Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private static void of_1154349490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154349490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1253038697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253038697L))
            info.setReturnValue(1088864584);
    }

    @Inject(at = @At("HEAD"), method = "step(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private void step__2096663414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096663414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1253038697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253038697L))
            info.setReturnValue(1088864584);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getCoordinate_1322671604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322671604L))
            info.setReturnValue(-1543816795);
    }


}
