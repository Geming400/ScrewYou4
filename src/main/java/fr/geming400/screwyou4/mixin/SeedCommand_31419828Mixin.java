package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SeedCommand.class)
public class SeedCommand_31419828Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Z)V", cancellable = true)
    private static void register_712889173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(712889173L))
            info.cancel();
    }


}
