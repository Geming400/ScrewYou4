package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.class)
public class Action1861505400Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private static void values__2089826715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089826715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private static void valueOf__1605277342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605277342L))
            info.setReturnValue(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.SUCCESSFULLY_LOADED);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_1899783983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899783983L))
            info.setReturnValue(true);
    }


}
