package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoubleBlockCombiner.NeighborCombineResult.Single.class)
public class Single995026739Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/DoubleBlockCombiner$Combiner;)Ljava/lang/Object;", cancellable = true)
    private void apply__1501181051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501181051L))
            info.setReturnValue(null);
    }


}
