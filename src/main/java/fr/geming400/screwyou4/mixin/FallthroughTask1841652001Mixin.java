package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.FallthroughTask.class)
public class FallthroughTask1841652001Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__1386668981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1386668981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "instance()Lnet/minecraft/commands/execution/EntryAction;", cancellable = true)
    private static void instance__299542370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299542370L))
            info.setReturnValue(null);
    }


}
