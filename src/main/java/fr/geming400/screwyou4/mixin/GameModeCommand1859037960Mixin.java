package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.GameModeCommand.class)
public class GameModeCommand1859037960Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_1741083430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741083430L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private static void setGameMode__1714396703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1714396703L))
            info.cancel();
    }


}
