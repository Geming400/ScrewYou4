package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.Vec3Argument.class)
public class Vec3Argument_758048244Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1719308337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719308337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__533236087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533236087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVec3(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getVec3__1656350979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656350979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec3(Z)Lnet/minecraft/commands/arguments/coordinates/Vec3Argument;", cancellable = true)
    private static void vec3_994553116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994553116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec3()Lnet/minecraft/commands/arguments/coordinates/Vec3Argument;", cancellable = true)
    private static void vec3__52988044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52988044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_6490452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6490452L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1812305054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1812305054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinates(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private static void getCoordinates__1490708299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490708299L))
            info.setReturnValue(null);
    }


}
