package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.NbtPathArgument.class)
public class NbtPathArgument130537588Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1091797682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1091797682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private void parse__79177394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79177394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private static void getPath_1705807716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705807716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbtPath()Lnet/minecraft/commands/arguments/NbtPathArgument;", cancellable = true)
    private static void nbtPath__1147448439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1147448439L))
            info.setReturnValue(new net.minecraft.commands.arguments.NbtPathArgument());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1855151587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855151587L))
            info.setReturnValue(null);
    }


}
