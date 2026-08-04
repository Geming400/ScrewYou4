package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.Vec3Argument.class)
public class Vec3Argument_758048244Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__406710564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406710564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_464666500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464666500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_998971685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998971685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec3(Z)Lnet/minecraft/commands/arguments/coordinates/Vec3Argument;", cancellable = true)
    private static void vec3__541525507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541525507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vec3()Lnet/minecraft/commands/arguments/coordinates/Vec3Argument;", cancellable = true)
    private static void vec3__1903654285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903654285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVec3(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getVec3_1658441896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658441896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinates(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private static void getCoordinates__1632924838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632924838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1055600029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055600029L))
            info.setReturnValue(null);
    }


}
