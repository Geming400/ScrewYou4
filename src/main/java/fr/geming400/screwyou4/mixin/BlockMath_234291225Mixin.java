package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockMath.class)
public class BlockMath_234291225Mixin {
        @Inject(at = @At("HEAD"), method = "getFaceTransformation(Lcom/mojang/math/Transformation;Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void getFaceTransformation__1414995265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414995265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCenterToCorner(Lcom/mojang/math/Transformation;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void blockCenterToCorner__900825823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900825823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCornerToCenter(Lcom/mojang/math/Transformation;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void blockCornerToCenter_1598586145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598586145L))
            info.setReturnValue(null);
    }


}
