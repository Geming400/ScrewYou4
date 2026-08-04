package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.DebugMobSpawningCommand.class)
public class DebugMobSpawningCommand_1848012215Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_904451991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(904451991L))
            info.cancel();
    }


}
