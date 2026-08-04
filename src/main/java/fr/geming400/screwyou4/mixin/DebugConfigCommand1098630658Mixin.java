package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.DebugConfigCommand.class)
public class DebugConfigCommand1098630658Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__988726919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988726919L))
            info.cancel();
    }


}
