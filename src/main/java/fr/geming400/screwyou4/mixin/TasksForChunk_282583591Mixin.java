package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskPriorityQueue.TasksForChunk.class)
public class TasksForChunk_282583591Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__626042678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626042678L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1053007115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053007115L))
            info.setReturnValue("!!L0CeA<\u0793]\uA9D1bCJ3i'\u1EEEh\u0DA1s`B76K\u6A25LNy!@|l\u0DEAHyc!X\uFB1EeCi@C%pXMipw:}Z94jFS7L\u52A5ma|3L\u3990U/@;:Y!a<BjcK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_839935681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839935681L))
            info.setReturnValue(1794393153);
    }

    @Inject(at = @At("HEAD"), method = "tasks()Ljava/util/List;", cancellable = true)
    private void tasks_186972388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186972388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()J", cancellable = true)
    private void chunkPos__1760286842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760286842L))
            info.setReturnValue(-8135036088153910916L);
    }


}
