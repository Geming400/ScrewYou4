package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundFinishConfigurationPacket.class)
public class ServerboundFinishConfigurationPacket1580034810Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1735902400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735902400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1284322947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284322947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle__801215200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801215200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__2053016917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053016917L))
            info.setReturnValue(false);
    }


}
