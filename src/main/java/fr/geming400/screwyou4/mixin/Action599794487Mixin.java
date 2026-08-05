package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.Action.class)
public class Action599794487Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private static void values__1405617110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405617110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private static void valueOf__1144996285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144996285L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.Action.REQUEST_GAMERULE_VALUES);
    }


}
