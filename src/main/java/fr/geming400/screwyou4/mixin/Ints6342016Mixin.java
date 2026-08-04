package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.RangeArgument.Ints.class)
public class Ints6342016Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__287039727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287039727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void parse_1418595992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418595992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private static void getRange__1669000374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669000374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1807306256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807306256L))
            info.setReturnValue(null);
    }


}
