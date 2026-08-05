package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SpawnArmorTrimsCommand.class)
public class SpawnArmorTrimsCommand1998649738Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_1880695208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880695208L))
            info.cancel();
    }


}
