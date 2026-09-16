package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.class)
public class ResourceArgument_522410923Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getResource_2018313523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018313523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void parse_1801424188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801424188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1483671016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483671016L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAttribute(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getAttribute__1885523295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885523295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resource(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceArgument;", cancellable = true)
    private static void resource_2127884587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127884587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClock(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getClock__1962660077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962660077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__229146869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229146869L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__2047942375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047942375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityType(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getEntityType__1542679698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542679698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMobEffect(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getMobEffect_818934710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818934710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantment(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getEnchantment_955653052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955653052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTimeline(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getTimeline__147440782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147440782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSummonableEntityType(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getSummonableEntityType__343870199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343870199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructure(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getStructure_237148792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237148792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConfiguredFeature(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void getConfiguredFeature_920946909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920946909L))
            info.setReturnValue(null);
    }


}
