package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkPyramid.Builder.class)
public class Builder1156041562Mixin {
        @Inject(at = @At("HEAD"), method = "step(Lnet/minecraft/world/level/chunk/status/ChunkStatus;Ljava/util/function/UnaryOperator;)Lnet/minecraft/world/level/chunk/status/ChunkPyramid$Builder;", cancellable = true)
    private void step__303267525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303267525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/chunk/status/ChunkPyramid;", cancellable = true)
    private void build__528093554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528093554L))
            info.setReturnValue(null);
    }


}
