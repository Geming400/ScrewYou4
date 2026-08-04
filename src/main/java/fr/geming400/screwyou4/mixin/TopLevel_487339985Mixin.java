package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.execution.tasks.BuildContexts.TopLevel.class)
public class TopLevel_487339985Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/commands/execution/ExecutionContext;Lnet/minecraft/commands/execution/Frame;)V", cancellable = true)
    private void execute_962606981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(962606981L))
            info.cancel();
    }


}
