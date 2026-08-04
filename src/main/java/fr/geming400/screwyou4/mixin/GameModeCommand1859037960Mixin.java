package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.GameModeCommand.class)
public class GameModeCommand1859037960Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_915477737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(915477737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private static void setGameMode__941225366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-941225366L))
            info.cancel();
    }


}
