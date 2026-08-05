package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.class)
public class Action1690914255Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private static void values__849522902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849522902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private static void valueOf__588902077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588902077L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.REMOVE);
    }


}
