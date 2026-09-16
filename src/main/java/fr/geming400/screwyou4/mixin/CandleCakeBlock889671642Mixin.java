package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CandleCakeBlock.class)
public class CandleCakeBlock889671642Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1956116896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956116896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byCandle(Lnet/minecraft/world/level/block/CandleBlock;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void byCandle__72924697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72924697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canLight(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canLight__823613486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823613486L))
            info.setReturnValue(false);
    }


}
