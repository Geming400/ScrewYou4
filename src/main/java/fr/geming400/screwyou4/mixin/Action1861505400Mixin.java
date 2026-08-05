package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.class)
public class Action1861505400Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private static void values_1691345283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691345283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private static void valueOf_1180656266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180656266L))
            info.setReturnValue(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.SUCCESSFULLY_LOADED);
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__1771546327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771546327L))
            info.setReturnValue(true);
    }


}
