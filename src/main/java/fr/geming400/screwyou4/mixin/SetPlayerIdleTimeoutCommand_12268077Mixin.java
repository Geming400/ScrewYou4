package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SetPlayerIdleTimeoutCommand.class)
public class SetPlayerIdleTimeoutCommand_12268077Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__931292147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-931292147L))
            info.cancel();
    }


}
