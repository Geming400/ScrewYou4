package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.TriggerCommand.class)
public class TriggerCommand_548518497Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__395041727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-395041727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestObjectives(Lnet/minecraft/commands/CommandSourceStack;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void suggestObjectives_1939632770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939632770L))
            info.setReturnValue(null);
    }


}
