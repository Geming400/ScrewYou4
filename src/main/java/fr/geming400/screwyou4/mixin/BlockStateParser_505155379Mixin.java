package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.class)
public class BlockStateParser_505155379Mixin {
        @Inject(at = @At("HEAD"), method = "serialize(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/String;", cancellable = true)
    private static void serialize_1608695620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608695620L))
            info.setReturnValue("jSw)\uBF28S4t_z\uD391\u965F4d@Mfk(a9y=\u6991\u4AB6Im3gE5d=L");
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;ZZ)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void fillSuggestions__145219179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145219179L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "parseForTesting(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;Z)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void parseForTesting__1278869936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278869936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForTesting(Lnet/minecraft/core/HolderLookup;Ljava/lang/String;Z)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void parseForTesting__1090741806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090741806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForBlock(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult;", cancellable = true)
    private static void parseForBlock__1486932954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486932954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForBlock(Lnet/minecraft/core/HolderLookup;Ljava/lang/String;Z)Lnet/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult;", cancellable = true)
    private static void parseForBlock_494872638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494872638L))
            info.setReturnValue(null);
    }


}
