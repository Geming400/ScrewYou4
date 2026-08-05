package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenSignEditorPacket.class)
public class ClientboundOpenSignEditorPacket_1019159135Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1175026724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175026724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__572318460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-572318460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_723447271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(723447271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFrontText()Z", cancellable = true)
    private void isFrontText_1344655017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344655017L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1508724865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508724865L))
            info.setReturnValue(null);
    }


}
