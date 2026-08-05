package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.class)
public class ScoreHolderArgument195134605Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/ScoreHolder;", cancellable = true)
    private static void getName_1283405390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283405390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Result;", cancellable = true)
    private void parse__990698519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990698519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Result;", cancellable = true)
    private void parse__1456674555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456674555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__98247138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98247138L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse__1658994046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658994046L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getNames(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getNames_2017100209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017100209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNames(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Ljava/util/function/Supplier;)Ljava/util/Collection;", cancellable = true)
    private static void getNames__199648603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199648603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamesWithDefaultWildcard(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getNamesWithDefaultWildcard_2017100209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017100209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scoreHolders()Lnet/minecraft/commands/arguments/ScoreHolderArgument;", cancellable = true)
    private static void scoreHolders_477341796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477341796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scoreHolder()Lnet/minecraft/commands/arguments/ScoreHolderArgument;", cancellable = true)
    private static void scoreHolder_477341796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477341796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1618513667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618513667L))
            info.setReturnValue(null);
    }


}
