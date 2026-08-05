package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockPredicateArgument.class)
public class BlockPredicateArgument1656594961Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1363213218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363213218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument$Result;", cancellable = true)
    private static void parse_1874835141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874835141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument$Result;", cancellable = true)
    private void parse__2087455838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087455838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/function/Predicate;", cancellable = true)
    private static void getBlockPredicate__1770602093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770602093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1897518403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897518403L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__157053311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157053311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/blocks/BlockPredicateArgument;", cancellable = true)
    private static void blockPredicate_2136376189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136376189L))
            info.setReturnValue(null);
    }


}
