package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundLoginAcknowledgedPacket.class)
public class ServerboundLoginAcknowledgedPacket_2133055806Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2006043901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006043901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1837343942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1837343942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle__956609219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-956609219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__1499995922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499995922L))
            info.setReturnValue(true);
    }


}
