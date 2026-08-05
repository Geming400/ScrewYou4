package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.CallFunction.class)
public class CallFunction2021680444Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Object;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_1483152842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483152842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__260800506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-260800506L))
            info.cancel();
    }


}
