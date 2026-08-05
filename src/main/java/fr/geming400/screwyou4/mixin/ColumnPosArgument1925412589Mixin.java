package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.ColumnPosArgument.class)
public class ColumnPosArgument1925412589Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1408294613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408294613L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse_634128259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634128259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnPos()Lnet/minecraft/commands/arguments/coordinates/ColumnPosArgument;", cancellable = true)
    private static void columnPos_1026571510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026571510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1173854798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173854798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__644940708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644940708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColumnPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ColumnPos;", cancellable = true)
    private static void getColumnPos__882523572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882523572L))
            info.setReturnValue(null);
    }


}
