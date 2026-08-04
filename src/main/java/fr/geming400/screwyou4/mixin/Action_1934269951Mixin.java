package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket.Action.class)
public class Action_1934269951Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;", cancellable = true)
    private static void values__645070011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645070011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;", cancellable = true)
    private static void valueOf__713393752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713393752L))
            info.setReturnValue(null);
    }


}
