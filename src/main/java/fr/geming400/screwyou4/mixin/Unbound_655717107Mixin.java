package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.BuildContexts.Unbound.class)
public class Unbound_655717107Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute__565269039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-565269039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "execute(Ljava/lang/Object;Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_557220683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557220683L))
            info.cancel();
    }


}
