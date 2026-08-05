package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.RangeArgument.Ints.class)
public class Ints6342016Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_967602110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967602110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void parse_860325195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860325195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void getRange__1684906415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684906415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1730956015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730956015L))
            info.setReturnValue(null);
    }


}
