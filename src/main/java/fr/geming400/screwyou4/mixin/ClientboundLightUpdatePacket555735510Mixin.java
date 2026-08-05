package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLightUpdatePacket.class)
public class ClientboundLightUpdatePacket555735510Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1123289578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123289578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_753243044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(753243044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1233804423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1233804423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_593997756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593997756L))
            info.setReturnValue(-1856647444);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_593997756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593997756L))
            info.setReturnValue(-1856647444);
    }

    @Inject(at = @At("HEAD"), method = "getLightData()Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacketData;", cancellable = true)
    private void getLightData__218622005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218622005L))
            info.setReturnValue(null);
    }


}
