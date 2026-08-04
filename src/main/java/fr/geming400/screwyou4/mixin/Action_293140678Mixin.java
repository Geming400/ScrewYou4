package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.class)
public class Action_293140678Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private static void values_1026123241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026123241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private static void valueOf__148790234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148790234L))
            info.setReturnValue(null);
    }


}
