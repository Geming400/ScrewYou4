package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.WardenSpawnTrackerCommand.class)
public class WardenSpawnTrackerCommand1776377499Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_1658422969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658422969L))
            info.cancel();
    }


}
