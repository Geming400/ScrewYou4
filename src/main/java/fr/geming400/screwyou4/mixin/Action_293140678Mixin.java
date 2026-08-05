package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.class)
public class Action_293140678Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private static void values__1888374649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888374649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private static void valueOf_1999357774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999357774L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.STAB);
    }


}
