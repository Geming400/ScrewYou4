package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.Plane.class)
public class Plane_1458334495Mixin {
        @Inject(at = @At("HEAD"), method = "length()I", cancellable = true)
    private void length_1496596740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496596740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction$Plane;", cancellable = true)
    private static void values__1527962814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527962814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1450992079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450992079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void test_338412257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338412257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction$Plane;", cancellable = true)
    private static void valueOf_1336100671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336100671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__693281538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693281538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_1247628179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247628179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomDirection(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getRandomDirection_1174639113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174639113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomAxis(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void getRandomAxis__902693024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-902693024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void shuffledCopy_1414817710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414817710L))
            info.setReturnValue(null);
    }


}
