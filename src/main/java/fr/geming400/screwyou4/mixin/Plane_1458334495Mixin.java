package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.Plane.class)
public class Plane_1458334495Mixin {
        @Inject(at = @At("HEAD"), method = "length()I", cancellable = true)
    private void length__1250630178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250630178L))
            info.setReturnValue(490127932);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction$Plane;", cancellable = true)
    private static void values_682439776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682439776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__278637217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-278637217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void test_255665423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255665423L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction$Plane;", cancellable = true)
    private static void valueOf__1648392089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648392089L))
            info.setReturnValue(net.minecraft.core.Direction.Plane.HORIZONTAL);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1202554004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202554004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_720645139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720645139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void shuffledCopy_993512718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993512718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomDirection(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getRandomDirection_2110628995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110628995L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getRandomAxis(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void getRandomAxis__1220512678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220512678L))
            info.setReturnValue(net.minecraft.core.Direction.Axis.Z);
    }


}
