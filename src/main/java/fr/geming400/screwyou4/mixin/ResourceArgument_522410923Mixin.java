package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.class)
public class ResourceArgument_522410923Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getResource__13029321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13029321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void parse_1607204617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607204617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_229029179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229029179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getAttribute_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resource(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceArgument;", cancellable = true)
    private static void resource_744356637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744356637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClock(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getClock_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityType(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getEntityType_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructure(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructure_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSummonableEntityType(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getSummonableEntityType_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTimeline(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getTimeline_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMobEffect(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getMobEffect_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantment(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getEnchantment_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_763334364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763334364L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1291237350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291237350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConfiguredFeature(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getConfiguredFeature_1448780987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448780987L))
            info.setReturnValue(null);
    }


}
