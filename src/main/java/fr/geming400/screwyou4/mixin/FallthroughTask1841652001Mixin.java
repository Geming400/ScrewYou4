package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.FallthroughTask.class)
public class FallthroughTask1841652001Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__1978048298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1978048298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "instance()Lnet/minecraft/commands/execution/EntryAction;", cancellable = true)
    private static void instance__1050447031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050447031L))
            info.setReturnValue(null);
    }


}
