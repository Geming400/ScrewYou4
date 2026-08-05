package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.IdentifierArgument.class)
public class IdentifierArgument807015472Mixin {
        @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/commands/arguments/IdentifierArgument;", cancellable = true)
    private static void id_2098991162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098991162L))
            info.setReturnValue(new net.minecraft.commands.arguments.IdentifierArgument());
    }

    @Inject(at = @At("HEAD"), method = "getId(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getId__1706381525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706381525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_513633729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513633729L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse_792580653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792580653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1006632800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006632800L))
            info.setReturnValue(null);
    }


}
