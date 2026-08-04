package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.AngleArgument.class)
public class AngleArgument_1568779454Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/AngleArgument$SingleAngle;", cancellable = true)
    private void parse_18655862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18655862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1275397710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275397710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "angle()Lnet/minecraft/commands/arguments/AngleArgument;", cancellable = true)
    private static void angle__1055460289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055460289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAngle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)F", cancellable = true)
    private static void getAngle_804817692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804817692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__244868819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244868819L))
            info.setReturnValue(null);
    }


}
