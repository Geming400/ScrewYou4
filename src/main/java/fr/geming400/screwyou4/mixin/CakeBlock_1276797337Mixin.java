package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CakeBlock.class)
public class CakeBlock_1276797337Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1282316236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282316236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputSignal(I)I", cancellable = true)
    private static void getOutputSignal__1804265233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804265233L))
            info.setReturnValue(null);
    }


}
