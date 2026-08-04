package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoubleBlockCombiner.class)
public class DoubleBlockCombiner_1019909023Mixin {
        @Inject(at = @At("HEAD"), method = "combineWithNeigbour(Lnet/minecraft/world/level/block/entity/BlockEntityType;Ljava/util/function/Function;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Ljava/util/function/BiPredicate;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$NeighborCombineResult;", cancellable = true)
    private static void combineWithNeigbour_1469756323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469756323L))
            info.setReturnValue(null);
    }


}
