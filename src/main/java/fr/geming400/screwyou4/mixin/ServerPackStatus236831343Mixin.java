package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.ServerPackStatus.class)
public class ServerPackStatus236831343Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__1940077822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940077822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private static void values__795738514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795738514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private static void valueOf__1641025493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641025493L))
            info.setReturnValue(null);
    }


}
