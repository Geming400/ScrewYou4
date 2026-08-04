package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.IsolatedCall.class)
public class IsolatedCall157619133Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_632886130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632886130L))
            info.cancel();
    }


}
