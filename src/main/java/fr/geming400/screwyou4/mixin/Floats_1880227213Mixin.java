package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.RangeArgument.Floats.class)
public class Floats_1880227213Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1453479990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453479990L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void parse__1166696691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166696691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private static void getRange_1478632759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478632759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__690126085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690126085L))
            info.setReturnValue(null);
    }


}
