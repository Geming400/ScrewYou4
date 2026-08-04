package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.NbtPathArgument.class)
public class NbtPathArgument130537588Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__162844155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162844155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private void parse_47348129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47348129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private static void getPath__1178866145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178866145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbtPath()Lnet/minecraft/commands/arguments/NbtPathArgument;", cancellable = true)
    private static void nbtPath_523036612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523036612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1683110684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683110684L))
            info.setReturnValue(null);
    }


}
