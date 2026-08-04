package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockMath.class)
public class BlockMath_234291225Mixin {
        @Inject(at = @At("HEAD"), method = "getFaceTransformation(Lcom/mojang/math/Transformation;Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void getFaceTransformation__1028341501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028341501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCenterToCorner(Lcom/mojang/math/Transformation;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void blockCenterToCorner_149413903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149413903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCornerToCenter(Lcom/mojang/math/Transformation;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void blockCornerToCenter_149413903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149413903L))
            info.setReturnValue(null);
    }


}
