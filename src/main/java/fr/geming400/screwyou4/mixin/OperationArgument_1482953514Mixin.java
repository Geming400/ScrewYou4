package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.OperationArgument.class)
public class OperationArgument_1482953514Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1189571770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189571770L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/OperationArgument$Operation;", cancellable = true)
    private void parse_378091154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378091154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/commands/arguments/OperationArgument;", cancellable = true)
    private static void operation__489582313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489582313L))
            info.setReturnValue(new net.minecraft.commands.arguments.OperationArgument());
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1723876955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723876955L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__330694759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330694759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOperation(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/OperationArgument$Operation;", cancellable = true)
    private static void getOperation__1931380720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931380720L))
            info.setReturnValue(null);
    }


}
