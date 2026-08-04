package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.data.DataCommands.class)
public class DataCommands_1774159342Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_830599118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830599118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSingleTag(Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;Lnet/minecraft/server/commands/data/DataAccessor;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void getSingleTag__1028045174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028045174L))
            info.setReturnValue(null);
    }


}
