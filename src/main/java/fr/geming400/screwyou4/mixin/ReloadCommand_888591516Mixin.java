package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.ReloadCommand.class)
public class ReloadCommand_888591516Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__54968708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-54968708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reloadPacks(Ljava/util/Collection;Lnet/minecraft/commands/CommandSourceStack;)V", cancellable = true)
    private static void reloadPacks__799268809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-799268809L))
            info.cancel();
    }


}
