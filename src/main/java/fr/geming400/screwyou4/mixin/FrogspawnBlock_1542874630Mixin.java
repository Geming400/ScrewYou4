package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FrogspawnBlock.class)
public class FrogspawnBlock_1542874630Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1016238943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016238943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHatchDelay(II)V", cancellable = true)
    private static void setHatchDelay_546995408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(546995408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDefaultHatchDelay()V", cancellable = true)
    private static void setDefaultHatchDelay_1581149616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1581149616L))
            info.cancel();
    }


}
