package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.Action.class)
public class Action599794487Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private static void values__1250495736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250495736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private static void valueOf_981892203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981892203L))
            info.setReturnValue(null);
    }


}
