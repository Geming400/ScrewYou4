package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.Action.class)
public class Action_491738431Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket$Action;", cancellable = true)
    private static void values_9896507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9896507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket$Action;", cancellable = true)
    private static void valueOf_1805375992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805375992L))
            info.setReturnValue(null);
    }


}
