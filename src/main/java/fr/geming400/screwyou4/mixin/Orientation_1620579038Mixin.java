package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.Orientation.class)
public class Orientation_1620579038Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1903965230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903965230L))
            info.setReturnValue("2\u366BgL\u3727se90O\uCFA1)NFn6UzEN\u8716b.da{|HG%qt6V&m27f.\u23A1ruAwG8%U5oT");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void of__1611484193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611484193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromIndex(I)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void fromIndex_466401169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466401169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_2016946983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016946983L))
            info.setReturnValue(-1732740189);
    }

    @Inject(at = @At("HEAD"), method = "random(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void random_1070390511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070390511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSideBias(Lnet/minecraft/world/level/redstone/Orientation$SideBias;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withSideBias__708734992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708734992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFrontPreserveUp(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFrontPreserveUp_1971733464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971733464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFrontAdjustSideBias(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFrontAdjustSideBias__2043966544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043966544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSideBias()Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private void getSideBias_1853296088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853296088L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirections()Ljava/util/List;", cancellable = true)
    private void getHorizontalDirections__104440165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104440165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirections()Ljava/util/List;", cancellable = true)
    private void getVerticalDirections_1483932653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483932653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirections()Ljava/util/List;", cancellable = true)
    private void getDirections_751524055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751524055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFront(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFront__2023613135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023613135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUp()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getUp__134706247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134706247L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "withMirror()Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withMirror__780503521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780503521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFront()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getFront__2117240037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117240037L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "withUp(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withUp__1643707729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643707729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSide()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getSide__727357963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727357963L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }


}
