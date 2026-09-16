package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStep.Builder.class)
public class Builder_1810050070Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/chunk/status/ChunkStep;", cancellable = true)
    private void build_1809653527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809653527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTask(Lnet/minecraft/world/level/chunk/status/ChunkStatusTask;)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void setTask__847964273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847964273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateWriteRadius(I)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void blockStateWriteRadius__1257893044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257893044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRequirement(Lnet/minecraft/world/level/chunk/status/ChunkStatus;I)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void addRequirement__918455642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918455642L))
            info.setReturnValue(null);
    }


}
