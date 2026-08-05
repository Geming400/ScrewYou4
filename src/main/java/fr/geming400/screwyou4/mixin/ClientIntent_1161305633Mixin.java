package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.handshake.ClientIntent.class)
public class ClientIntent_1161305633Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void values__1339202846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339202846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void valueOf_955726789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955726789L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.TRANSFER);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1199567878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199567878L))
            info.setReturnValue(-1276432598);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/network/protocol/handshake/ClientIntent;", cancellable = true)
    private static void byId_1083733748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083733748L))
            info.setReturnValue(net.minecraft.network.protocol.handshake.ClientIntent.LOGIN);
    }


}
