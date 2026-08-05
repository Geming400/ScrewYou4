package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStep.Builder.class)
public class Builder_1810050070Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/chunk/status/ChunkStep;", cancellable = true)
    private void build__1940572375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940572375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTask(Lnet/minecraft/world/level/chunk/status/ChunkStatusTask;)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void setTask_547739080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547739080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStateWriteRadius(I)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void blockStateWriteRadius__1451221095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451221095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRequirement(Lnet/minecraft/world/level/chunk/status/ChunkStatus;I)Lnet/minecraft/world/level/chunk/status/ChunkStep$Builder;", cancellable = true)
    private void addRequirement_2066329288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066329288L))
            info.setReturnValue(null);
    }


}
