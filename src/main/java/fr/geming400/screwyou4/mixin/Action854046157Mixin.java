package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action.class)
public class Action854046157Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket$Action;", cancellable = true)
    private static void values__1859498262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859498262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket$Action;", cancellable = true)
    private static void valueOf__1598877437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598877437L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action.STOP_SPRINTING);
    }


}
