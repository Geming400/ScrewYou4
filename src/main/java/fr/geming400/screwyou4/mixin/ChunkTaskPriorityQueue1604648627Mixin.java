package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskPriorityQueue.class)
public class ChunkTaskPriorityQueue1604648627Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1919895640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919895640L))
            info.setReturnValue("<@Ys[\u1175$jC^_\"\u1CBE(6d%q\u7B39Y\u9AF1`G!7ZMJc)\u2638fym;[2\u55B1+`)*jg'nHpy\uFD18>7L+C\"GU8c?U8lKN 5X\u24F26{3P/1!\u6D6Esx>wKv{2';");
    }

    @Inject(at = @At("HEAD"), method = "pop()Lnet/minecraft/server/level/ChunkTaskPriorityQueue$TasksForChunk;", cancellable = true)
    private void pop_1103884346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103884346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1556015743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556015743L))
            info.setReturnValue(false);
    }


}
