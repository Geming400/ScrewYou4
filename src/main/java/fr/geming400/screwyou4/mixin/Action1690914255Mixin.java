package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Action.class)
public class Action1690914255Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private static void values__694401528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694401528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;", cancellable = true)
    private static void valueOf_1537986411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537986411L))
            info.setReturnValue(null);
    }


}
