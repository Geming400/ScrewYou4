package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.OperationArgument.class)
public class OperationArgument_1482953514Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1850753689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850753689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/OperationArgument$Operation;", cancellable = true)
    private void parse_280819647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280819647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_731395722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731395722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1087399784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087399784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOperation(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/OperationArgument$Operation;", cancellable = true)
    private static void getOperation__482601089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482601089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/commands/arguments/OperationArgument;", cancellable = true)
    private static void operation_2046363006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046363006L))
            info.setReturnValue(new net.minecraft.commands.arguments.OperationArgument());
    }


}
