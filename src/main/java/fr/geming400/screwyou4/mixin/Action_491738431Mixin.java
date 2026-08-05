package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Action.class)
public class Action_491738431Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket$Action;", cancellable = true)
    private static void values_173854169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173854169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket$Action;", cancellable = true)
    private static void valueOf__972019424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972019424L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Action.ADD_PLAYER);
    }


}
