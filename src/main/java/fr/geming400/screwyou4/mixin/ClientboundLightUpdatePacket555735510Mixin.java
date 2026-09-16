package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLightUpdatePacket.class)
public class ClientboundLightUpdatePacket555735510Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_711603100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711603100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1035742084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1035742084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_260023647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260023647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1430543674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430543674L))
            info.setReturnValue(-793504389);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_1487801976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487801976L))
            info.setReturnValue(1685868667);
    }

    @Inject(at = @At("HEAD"), method = "getLightData()Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacketData;", cancellable = true)
    private void getLightData_984672885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984672885L))
            info.setReturnValue(null);
    }


}
