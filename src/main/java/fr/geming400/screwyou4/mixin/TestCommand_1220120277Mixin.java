package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestCommand.class)
public class TestCommand_1220120277Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__357689080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-357689080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackAndStartRunner(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/gametest/framework/GameTestRunner;)I", cancellable = true)
    private static void trackAndStartRunner__1134770043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134770043L))
            info.setReturnValue(-1267305680);
    }

    @Inject(at = @At("HEAD"), method = "suggestTestFunction(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void suggestTestFunction_451073424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451073424L))
            info.setReturnValue(null);
    }


}
