package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.TriggerCommand.class)
public class TriggerCommand_548518497Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_430563966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(430563966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestObjectives(Lnet/minecraft/commands/CommandSourceStack;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void suggestObjectives__1444232508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444232508L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
