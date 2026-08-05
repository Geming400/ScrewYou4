package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.Vec2Argument.class)
public class Vec2Argument1038903115Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__125855692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125855692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_745521372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745521372L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "vec2(Z)Lnet/minecraft/commands/arguments/coordinates/Vec2Argument;", cancellable = true)
    private static void vec2__389753354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389753354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec2()Lnet/minecraft/commands/arguments/coordinates/Vec2Argument;", cancellable = true)
    private static void vec2__1751882132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751882132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1279826557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279826557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__774745157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774745157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVec2(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private static void getVec2_1939266977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939266977L))
            info.setReturnValue(null);
    }


}
