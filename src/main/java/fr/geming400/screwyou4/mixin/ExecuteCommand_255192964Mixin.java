package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.ExecuteCommand.class)
public class ExecuteCommand_255192964Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Object;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__283334639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-283334639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__2027287987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2027287987L))
            info.cancel();
    }


}
