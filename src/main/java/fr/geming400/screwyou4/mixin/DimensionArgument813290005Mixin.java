package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.DimensionArgument.class)
public class DimensionArgument813290005Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1774550099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774550099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse__1827278977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827278977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/commands/arguments/DimensionArgument;", cancellable = true)
    private static void dimension__1605233142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605233142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_61732214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61732214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1757063292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757063292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDimension(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private static void getDimension__1450241687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450241687L))
            info.setReturnValue(null);
    }


}
