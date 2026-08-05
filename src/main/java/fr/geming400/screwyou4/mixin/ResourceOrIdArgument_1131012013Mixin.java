package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.class)
public class ResourceOrIdArgument_1131012013Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse__1305421774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305421774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_837630269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837630269L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createGrammar(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/util/parsing/packrat/commands/Grammar;", cancellable = true)
    private static void createGrammar_1192337855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192337855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootTable(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootTable_409550436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409550436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1371935454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371935454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__682636260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682636260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTable(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootTableArgument;", cancellable = true)
    private static void lootTable_1739843786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739843786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dialog(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$DialogArgument;", cancellable = true)
    private static void dialog_1145438824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145438824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootModifier(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootModifierArgument;", cancellable = true)
    private static void lootModifier_1834836401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834836401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootPredicateArgument;", cancellable = true)
    private static void lootPredicate_1466090305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466090305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootModifier(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootModifier_409550436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409550436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootPredicate_409550436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409550436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDialog(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDialog_409550436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409550436L))
            info.setReturnValue(null);
    }


}
