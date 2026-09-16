package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.RotationArgument.class)
public class RotationArgument_468366293Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__822918038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822918038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1429626386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429626386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private static void getRotation__1846046521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846046521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__2101987005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101987005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/commands/arguments/coordinates/RotationArgument;", cancellable = true)
    private static void rotation__1476059945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476059945L))
            info.setReturnValue(new net.minecraft.commands.arguments.coordinates.RotationArgument());
    }


}
