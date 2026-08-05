package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoubleBlockCombiner.BlockType.class)
public class BlockType1882471900Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void values__1616251155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616251155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void valueOf__1149610362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149610362L))
            info.setReturnValue(net.minecraft.world.level.block.DoubleBlockCombiner.BlockType.SINGLE);
    }


}
