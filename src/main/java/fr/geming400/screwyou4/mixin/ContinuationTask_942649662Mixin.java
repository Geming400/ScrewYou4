package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.ContinuationTask.class)
public class ContinuationTask_942649662Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_1417916658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1417916658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;Ljava/util/List;Lnet/minecraft/commands/execution/tasks/ContinuationTask$TaskProvider;)V", cancellable = true)
    private static void schedule_1022691063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1022691063L))
            info.cancel();
    }


}
