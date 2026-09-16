package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenRectangle.class)
public class ScreenRectangle_756067195Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom_94079509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94079509L))
            info.setReturnValue(1932767872);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__152559074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152559074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1526490719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526490719L))
            info.setReturnValue("\uFDFDMLm3Y0{i(_u.\uC730Tvz\u405FKd0g|\u0F9BXfk=wd<>EtUiEJJ\u2F30.24s]JdX^si3Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1313419285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313419285L))
            info.setReturnValue(-2003746176);
    }

    @Inject(at = @At("HEAD"), method = "getLength(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getLength__1441097585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441097585L))
            info.setReturnValue(1064312287);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/gui/navigation/ScreenAxis;IIII)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private static void of_28506974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28506974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/client/gui/navigation/ScreenPosition;", cancellable = true)
    private void position__1953910875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953910875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private static void empty_602616413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602616413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "step(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void step__1808331143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808331143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top__262976213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262976213L))
            info.setReturnValue(-1742431592);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left__1849963079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849963079L))
            info.setReturnValue(-1520025726);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right__684609340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684609340L))
            info.setReturnValue(-1982175367);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__884080806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884080806L))
            info.setReturnValue(-60438137);
    }

    @Inject(at = @At("HEAD"), method = "overlaps(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void overlaps_1927971176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927971176L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void intersects__803014256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803014256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "intersection(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void intersection_1868132230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868132230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__329281383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329281383L))
            info.setReturnValue(-1517731196);
    }

    @Inject(at = @At("HEAD"), method = "transformMaxBounds(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void transformMaxBounds_949282699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949282699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encompasses(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Z", cancellable = true)
    private void encompasses_1223044947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223044947L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBorder(Lnet/minecraft/client/gui/navigation/ScreenDirection;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void getBorder_1387776079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387776079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containsPoint(II)Z", cancellable = true)
    private void containsPoint_729525376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729525376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "transformAxisAligned(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void transformAxisAligned_141251841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141251841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundInDirection(Lnet/minecraft/client/gui/navigation/ScreenDirection;)I", cancellable = true)
    private void getBoundInDirection_1196085229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196085229L))
            info.setReturnValue(-1003477676);
    }

    @Inject(at = @At("HEAD"), method = "overlapsInAxis(Lnet/minecraft/client/gui/navigation/ScreenRectangle;Lnet/minecraft/client/gui/navigation/ScreenAxis;)Z", cancellable = true)
    private void overlapsInAxis__2144410375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144410375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCenterInAxis(Lnet/minecraft/client/gui/navigation/ScreenAxis;)I", cancellable = true)
    private void getCenterInAxis_1472567290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472567290L))
            info.setReturnValue(-1017742797);
    }


}
