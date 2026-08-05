package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.ContinuationTask.class)
public class ContinuationTask_942649662Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_2009295975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2009295975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;Ljava/util/List;Lnet/minecraft/commands/execution/tasks/ContinuationTask$TaskProvider;)V", cancellable = true)
    private static void schedule_426504782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426504782L))
            info.cancel();
    }


}
