package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.Action.class)
public class Action1492038307Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket$Action;", cancellable = true)
    private static void values__1917234178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917234178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket$Action;", cancellable = true)
    private static void valueOf__121754693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121754693L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.Action.CLOSED_SCREEN);
    }


}
