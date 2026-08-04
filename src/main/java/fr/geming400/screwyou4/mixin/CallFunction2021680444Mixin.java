package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.CallFunction.class)
public class CallFunction2021680444Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Object;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_1923184021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1923184021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_800694299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800694299L))
            info.cancel();
    }


}
