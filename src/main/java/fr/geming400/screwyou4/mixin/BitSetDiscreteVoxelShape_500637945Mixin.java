package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.BitSetDiscreteVoxelShape.class)
public class BitSetDiscreteVoxelShape_500637945Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1559754316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559754316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/IndexMerger;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/BitSetDiscreteVoxelShape;", cancellable = true)
    private static void join__304905449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304905449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fill(III)V", cancellable = true)
    private void fill__1379426425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1379426425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFull(III)Z", cancellable = true)
    private void isFull_2065629665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065629665L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInterior(III)Z", cancellable = true)
    private void isInterior__1647857918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647857918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withFilledBounds(IIIIIIIII)Lnet/minecraft/world/phys/shapes/BitSetDiscreteVoxelShape;", cancellable = true)
    private static void withFilledBounds__237110482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237110482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void lastFull_797095960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797095960L))
            info.setReturnValue(-1536164993);
    }

    @Inject(at = @At("HEAD"), method = "firstFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void firstFull_538097970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538097970L))
            info.setReturnValue(381871705);
    }


}
