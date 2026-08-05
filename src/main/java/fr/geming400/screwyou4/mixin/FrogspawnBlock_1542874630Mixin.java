package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FrogspawnBlock.class)
public class FrogspawnBlock_1542874630Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1685647413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685647413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultHatchDelay()V", cancellable = true)
    private static void setDefaultHatchDelay_1062250734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1062250734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHatchDelay(II)V", cancellable = true)
    private static void setHatchDelay__1579514357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579514357L))
            info.cancel();
    }


}
