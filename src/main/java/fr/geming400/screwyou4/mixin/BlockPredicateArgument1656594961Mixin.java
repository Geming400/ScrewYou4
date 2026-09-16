package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockPredicateArgument.class)
public class BlockPredicateArgument1656594961Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1677112241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677112241L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument$Result;", cancellable = true)
    private static void parse__1691177038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691177038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument$Result;", cancellable = true)
    private void parse__1577962219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577962219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument;", cancellable = true)
    private static void blockPredicate__1711060185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711060185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__913758336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913758336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_905037170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905037170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/function/Predicate;", cancellable = true)
    private static void getBlockPredicate__208554765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208554765L))
            info.setReturnValue(null);
    }


}
