package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceKeyArgument.class)
public class ResourceKeyArgument669525344Mixin {
        @Inject(at = @At("HEAD"), method = "key(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceKeyArgument;", cancellable = true)
    private static void key_975304896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975304896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void parse__543810917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543810917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_376143601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376143601L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getRegistryKey(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void getRegistryKey_8309205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8309205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureTemplatePool(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructureTemplatePool_1595895409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595895409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancement(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private static void getAdvancement_699002590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699002590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructure(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructure_1595895409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595895409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1144122928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144122928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_910448786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910448786L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getConfiguredFeature(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getConfiguredFeature_1595895409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595895409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipe(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private static void getRecipe_1097977062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097977062L))
            info.setReturnValue(null);
    }


}
