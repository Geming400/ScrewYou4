package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.RotationArgument.class)
public class RotationArgument_468366293Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse__696392515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696392515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_174984549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174984549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/commands/arguments/coordinates/RotationArgument;", cancellable = true)
    private static void rotation__2142087915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142087915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private static void getRotation__1922606789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922606789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1345281980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345281980L))
            info.setReturnValue(null);
    }


}
