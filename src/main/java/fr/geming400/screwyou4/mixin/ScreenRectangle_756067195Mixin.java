package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenRectangle.class)
public class ScreenRectangle_756067195Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2141579453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141579453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__379392781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379392781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_794329936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLength(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getLength_863962347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863962347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/gui/navigation/ScreenAxis;IIII)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private static void of__1707425835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707425835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private void position__1092573828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092573828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private static void empty_1931092746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931092746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "step(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void step__465998675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465998675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlaps(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void overlaps__341777572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341777572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void intersects__341777572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341777572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersection(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void intersection__1613687619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613687619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBorder(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void getBorder__465998675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465998675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_794329440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794329440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformMaxBounds(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void transformMaxBounds_2026707544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026707544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encompasses(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void encompasses__341777572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341777572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containsPoint(II)Z", cancellable = true)
    private void containsPoint__239808431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239808431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformAxisAligned(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void transformAxisAligned_2026707544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026707544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundInDirection(Lnet/minecraft/client/gui/navigation/ScreenDirection;)I", cancellable = true)
    private void getBoundInDirection__443804805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443804805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlapsInAxis(Lnet/minecraft/client/gui/navigation/ScreenRectangle;Lnet/minecraft/client/gui/navigation/ScreenAxis;)Z", cancellable = true)
    private void overlapsInAxis_1918387431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918387431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterInAxis(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getCenterInAxis_863962347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863962347L))
            info.setReturnValue(null);
    }


}
