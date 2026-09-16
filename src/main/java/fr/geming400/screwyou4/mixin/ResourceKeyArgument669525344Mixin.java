package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceKeyArgument.class)
public class ResourceKeyArgument669525344Mixin {
        @Inject(at = @At("HEAD"), method = "key(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceKeyArgument;", cancellable = true)
    private static void key_1803929217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803929217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void parse__349591346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349591346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1630785438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630785438L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1900827953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900827953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__82032447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82032447L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getConfiguredFeature(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getConfiguredFeature_1068061331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068061331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipe(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/item/crafting/RecipeHolder;", cancellable = true)
    private static void getRecipe__1267003934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267003934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructure(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructure_384263214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384263214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancement(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private static void getAdvancement__245367692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245367692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegistryKey(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;Lcom/mojang/brigadier/exceptions/DynamicCommandExceptionType;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void getRegistryKey_57997953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57997953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureTemplatePool(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructureTemplatePool_802706052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802706052L))
            info.setReturnValue(null);
    }


}
