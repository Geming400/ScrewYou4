package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.class)
public class ScoreHolderArgument195134605Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private static void getName_301360301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301360301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Result;", cancellable = true)
    private void parse_668731676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668731676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Result;", cancellable = true)
    private void parse__2072508552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072508552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1156394699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156394699L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse_9839087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9839087L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getNames(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getNames__1008952225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008952225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNames(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/util/Collection;", cancellable = true)
    private static void getNames_578971319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578971319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1919748604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919748604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scoreHolder()Lnet/minecraft/commands/arguments/ScoreHolderArgument;", cancellable = true)
    private static void scoreHolder__1736771134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736771134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamesWithDefaultWildcard(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getNamesWithDefaultWildcard__231860114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231860114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scoreHolders()Lnet/minecraft/commands/arguments/ScoreHolderArgument;", cancellable = true)
    private static void scoreHolders__1560183431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560183431L))
            info.setReturnValue(null);
    }


}
