package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.class)
public class ResourceOrTagKeyArgument1875730589Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1582348846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582348846L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;", cancellable = true)
    private void parse__744839617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744839617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_2116654031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116654031L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_62082317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62082317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceOrTagKey(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;", cancellable = true)
    private static void getResourceOrTagKey__992151499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992151499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceOrTagKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;", cancellable = true)
    private static void resourceOrTagKey__711685858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711685858L))
            info.setReturnValue(null);
    }


}
