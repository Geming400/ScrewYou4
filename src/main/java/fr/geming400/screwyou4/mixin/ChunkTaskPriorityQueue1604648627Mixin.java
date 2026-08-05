package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskPriorityQueue.class)
public class ChunkTaskPriorityQueue1604648627Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_469188156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469188156L))
            info.setReturnValue("\u3A4B0cW{o8cO/a->A%Qa");
    }

    @Inject(at = @At("HEAD"), method = "pop()Lnet/minecraft/server/level/ChunkTaskPriorityQueue$TasksForChunk;", cancellable = true)
    private void pop__553660437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553660437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1642927210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642927210L))
            info.setReturnValue(true);
    }


}
