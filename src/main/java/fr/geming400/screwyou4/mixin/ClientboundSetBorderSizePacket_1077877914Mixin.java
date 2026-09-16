package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderSizePacket.class)
public class ClientboundSetBorderSizePacket_1077877914Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1233745503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233745503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize_1511999907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511999907L))
            info.setReturnValue(3.384477002887765E8D);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_782166050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(782166050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__513599681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-513599681L))
            info.cancel();
    }


}
