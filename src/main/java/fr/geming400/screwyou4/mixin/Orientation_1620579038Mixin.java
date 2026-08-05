package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.Orientation.class)
public class Orientation_1620579038Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_485118566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485118566L))
            info.setReturnValue("Sh>ᬚ");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation$SideBias;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void of__1752558634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752558634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromIndex(I)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void fromIndex__270232103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270232103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_1658841283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658841283L))
            info.setReturnValue(1295879345);
    }

    @Inject(at = @At("HEAD"), method = "random(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void random__1351384622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351384622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFrontAdjustSideBias(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFrontAdjustSideBias_489752302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489752302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFrontPreserveUp(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFrontPreserveUp_489752302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489752302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirections()Ljava/util/List;", cancellable = true)
    private void getHorizontalDirections__1048051443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048051443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSideBias()Lnet/minecraft/world/level/redstone/Orientation$SideBias;", cancellable = true)
    private void getSideBias__1224283586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224283586L))
            info.setReturnValue(net.minecraft.world.level.redstone.Orientation.SideBias.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirections()Ljava/util/List;", cancellable = true)
    private void getVerticalDirections__1048051443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048051443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirections()Ljava/util/List;", cancellable = true)
    private void getDirections__1048051443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048051443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withMirror()Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withMirror__171117958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171117958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUp(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withUp_489752302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489752302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFront()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getFront_857723752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857723752L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getUp()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getUp_857723752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857723752L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getSide()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getSide_857723752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857723752L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "withFront(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withFront_489752302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489752302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSideBias(Lnet/minecraft/world/level/redstone/Orientation$SideBias;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private void withSideBias__570072122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570072122L))
            info.setReturnValue(null);
    }


}
