package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.DimensionArgument.class)
public class DimensionArgument813290005Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_519908262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519908262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse_798855186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798855186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/commands/arguments/DimensionArgument;", cancellable = true)
    private static void dimension_1304826532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304826532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1054213447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054213447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimension(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private static void getDimension__1894728167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894728167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1000358267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000358267L))
            info.setReturnValue(null);
    }


}
