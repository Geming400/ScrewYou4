package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.BitSetDiscreteVoxelShape.class)
public class BitSetDiscreteVoxelShape_500637945Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_538916527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538916527L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/BitSetDiscreteVoxelShape;", cancellable = true)
    private static void join_662934509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662934509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fill(III)V", cancellable = true)
    private void fill__279454460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-279454460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFull(III)Z", cancellable = true)
    private void isFull__279450616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279450616L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lastFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void lastFull_1667248851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667248851L))
            info.setReturnValue(931162961);
    }

    @Inject(at = @At("HEAD"), method = "firstFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void firstFull_1667248851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667248851L))
            info.setReturnValue(931162961);
    }

    @Inject(at = @At("HEAD"), method = "isInterior(III)Z", cancellable = true)
    private void isInterior__279450616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279450616L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withFilledBounds(IIIIIIIII)Lnet/minecraft/world/phys/shapes/BitSetDiscreteVoxelShape;", cancellable = true)
    private static void withFilledBounds_1783027819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783027819L))
            info.setReturnValue(null);
    }


}
