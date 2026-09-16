package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.Vec2Argument.class)
public class Vec2Argument1038903115Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__252381215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252381215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2000163209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000163209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec2(Z)Lnet/minecraft/commands/arguments/coordinates/Vec2Argument;", cancellable = true)
    private static void vec2__158068460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158068460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec2()Lnet/minecraft/commands/arguments/coordinates/Vec2Argument;", cancellable = true)
    private static void vec2__2021503090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021503090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1531450182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531450182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_287345324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287345324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVec2(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private static void getVec2__1891046347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891046347L))
            info.setReturnValue(null);
    }


}
