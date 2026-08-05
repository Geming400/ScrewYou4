package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.IdentifierArgument.class)
public class IdentifierArgument807015472Mixin {
        @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/commands/arguments/IdentifierArgument;", cancellable = true)
    private static void id_1682576255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682576255L))
            info.setReturnValue(new net.minecraft.commands.arguments.IdentifierArgument());
    }

    @Inject(at = @At("HEAD"), method = "getId(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getId_95304442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95304442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1768275566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768275566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse__1833553510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833553510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1763337825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763337825L))
            info.setReturnValue(null);
    }


}
