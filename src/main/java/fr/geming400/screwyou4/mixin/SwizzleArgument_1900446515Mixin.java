package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.SwizzleArgument.class)
public class SwizzleArgument_1900446515Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/EnumSet;", cancellable = true)
    private void parse_896185266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896185266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1433260688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433260688L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getSwizzle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/EnumSet;", cancellable = true)
    private static void getSwizzle_1756812665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756812665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swizzle()Lnet/minecraft/commands/arguments/coordinates/SwizzleArgument;", cancellable = true)
    private static void swizzle__1980383749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980383749L))
            info.setReturnValue(new net.minecraft.commands.arguments.coordinates.SwizzleArgument());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__669906783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669906783L))
            info.setReturnValue(null);
    }


}
