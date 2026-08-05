package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.Action.class)
public class Action1692958107Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket$Action;", cancellable = true)
    private static void values__1649522710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649522710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket$Action;", cancellable = true)
    private static void valueOf__1123942717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123942717L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.Action.QUERY);
    }


}
