package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.FetchProfileCommand.class)
public class FetchProfileCommand749971950Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__193588273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-193588273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "printForAvatar(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Avatar;)V", cancellable = true)
    private static void printForAvatar_778330682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(778330682L))
            info.cancel();
    }


}
