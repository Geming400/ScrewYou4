package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoubleBlockCombiner.NeighborCombineResult.Double.class)
public class Double1848516732Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/DoubleBlockCombiner$Combiner;)Ljava/lang/Object;", cancellable = true)
    private void apply__686811844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686811844L))
            info.setReturnValue(new java.lang.Object());
    }


}
