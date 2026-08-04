package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.SwizzleArgument.class)
public class SwizzleArgument_1900446515Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/EnumSet;", cancellable = true)
    private void parse_656993983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656993983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1607064771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607064771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swizzle()Lnet/minecraft/commands/arguments/coordinates/SwizzleArgument;", cancellable = true)
    private static void swizzle__1804753731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804753731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSwizzle(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/EnumSet;", cancellable = true)
    private static void getSwizzle__460378383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460378383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_86798242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86798242L))
            info.setReturnValue(null);
    }


}
