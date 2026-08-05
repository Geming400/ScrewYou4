package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestCommand.class)
public class TestCommand_1220120277Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__867237301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-867237301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackAndStartRunner(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/gametest/framework/GameTestRunner;)I", cancellable = true)
    private static void trackAndStartRunner__1098052149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098052149L))
            info.setReturnValue(1429808464);
    }

    @Inject(at = @At("HEAD"), method = "suggestTestFunction(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void suggestTestFunction_1461043966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461043966L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
