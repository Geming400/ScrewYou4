package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundLoginAcknowledgedPacket.class)
public class ServerboundLoginAcknowledgedPacket_2133055806Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_454030717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454030717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1483842578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483842578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle_271180389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271180389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal__2123632908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123632908L))
            info.setReturnValue(false);
    }


}
