package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.RangeArgument.Floats.class)
public class Floats_1880227213Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1586845469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586845469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void parse_165246624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165246624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void getRange__1405869666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405869666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_66578940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66578940L))
            info.setReturnValue(null);
    }


}
