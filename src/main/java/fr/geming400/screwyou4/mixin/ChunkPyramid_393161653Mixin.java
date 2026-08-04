package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkPyramid.class)
public class ChunkPyramid_393161653Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1778673911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778673911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__742298323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742298323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_431424394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431424394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "steps()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void steps_1360940185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360940185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStepTo(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStep;", cancellable = true)
    private void getStepTo_437520057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437520057L))
            info.setReturnValue(null);
    }


}
