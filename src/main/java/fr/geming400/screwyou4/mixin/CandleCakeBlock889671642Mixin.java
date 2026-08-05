package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CandleCakeBlock.class)
public class CandleCakeBlock889671642Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1669441930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669441930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canLight(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canLight_744382904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744382904L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byCandle(Lnet/minecraft/world/level/block/CandleBlock;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void byCandle_2064332459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064332459L))
            info.setReturnValue(null);
    }


}
