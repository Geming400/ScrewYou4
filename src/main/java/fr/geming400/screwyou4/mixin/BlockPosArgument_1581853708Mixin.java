package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.BlockPosArgument.class)
public class BlockPosArgument_1581853708Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse_417094900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417094900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1288471964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288471964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getBlockPos__262576312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262576312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/commands/arguments/coordinates/BlockPosArgument;", cancellable = true)
    private static void blockPos__1186971997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186971997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1822777149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822777149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__231794565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231794565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnablePos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getSpawnablePos__262576312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262576312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoadedBlockPos(Lcom/mojang/brigadier/context/CommandContext;Lnet/minecraft/server/level/ServerLevel;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLoadedBlockPos_1863303513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863303513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoadedBlockPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLoadedBlockPos__262576312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262576312L))
            info.setReturnValue(null);
    }


}
