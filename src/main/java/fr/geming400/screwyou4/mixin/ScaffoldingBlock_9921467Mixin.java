package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ScaffoldingBlock.class)
public class ScaffoldingBlock_9921467Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1745775190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745775190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1248678301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248678301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDistance(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getDistance__567623599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567623599L))
            info.setReturnValue(-449276092);
    }


}
