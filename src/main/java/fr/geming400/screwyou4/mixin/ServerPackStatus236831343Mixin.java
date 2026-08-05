package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.ServerPackStatus.class)
public class ServerPackStatus236831343Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__271231805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271231805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private static void values_1039058444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039058444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData$ServerPackStatus;", cancellable = true)
    private static void valueOf__885551277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885551277L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.ServerPackStatus.DISABLED);
    }


}
