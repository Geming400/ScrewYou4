package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.handshake.ClientIntent.class)
public class ClientIntent_1161305633Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void values__123678460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123678460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void valueOf__434972259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434972259L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.LOGIN);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1533878325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533878325L))
            info.setReturnValue(-1393318899);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void byId__598606906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598606906L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.LOGIN);
    }


}
