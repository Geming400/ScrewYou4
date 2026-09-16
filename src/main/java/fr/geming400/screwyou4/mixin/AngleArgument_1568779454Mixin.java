package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.AngleArgument.class)
public class AngleArgument_1568779454Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/AngleArgument$SingleAngle;", cancellable = true)
    private void parse__1313287453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313287453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1764927749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764927749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "angle()Lnet/minecraft/commands/arguments/AngleArgument;", cancellable = true)
    private static void angle__533349998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533349998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1001573844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001573844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAngle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)F", cancellable = true)
    private static void getAngle_1186884537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186884537L))
            info.setReturnValue(2.479412E8F);
    }


}
