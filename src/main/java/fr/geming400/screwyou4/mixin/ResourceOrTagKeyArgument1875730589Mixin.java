package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.class)
public class ResourceOrTagKeyArgument1875730589Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1457976613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457976613L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;", cancellable = true)
    private void parse_511707372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511707372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1124172798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124172798L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__694622708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694622708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceOrTagKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;", cancellable = true)
    private static void resourceOrTagKey_921431156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921431156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceOrTagKey(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;", cancellable = true)
    private static void getResourceOrTagKey__1010172695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010172695L))
            info.setReturnValue(null);
    }


}
