package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTaskPriorityQueue.TasksForChunk.class)
public class TasksForChunk_282583591Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1668095849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668095849L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__852876385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852876385L))
            info.setReturnValue("(,Wp赚=Od#nu|'Oxku73c(PybSs_237쒩<]齺gHkXǳ=&G쌗$4B㯓쳧I&%[⬕Z᷿&䈔Wꁨ뛸qC医n8aE寚I鵡{7弆iK_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_320846332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320846332L))
            info.setReturnValue(599117083);
    }

    @Inject(at = @At("HEAD"), method = "tasks()Ljava/util/List;", cancellable = true)
    private void tasks_1908920406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908920406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()J", cancellable = true)
    private void chunkPos_320846797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320846797L))
            info.setReturnValue(-780136226267543653L);
    }


}
