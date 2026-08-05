package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.FetchProfileCommand.class)
public class FetchProfileCommand749971950Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_632017420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632017420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "printForAvatar(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/entity/Avatar;)V", cancellable = true)
    private static void printForAvatar_757299397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(757299397L))
            info.cancel();
    }


}
