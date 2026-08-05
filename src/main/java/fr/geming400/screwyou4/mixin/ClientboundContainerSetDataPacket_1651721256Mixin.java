package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetDataPacket.class)
public class ClientboundContainerSetDataPacket_1651721256Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__27303833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27303833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue_1689983501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689983501L))
            info.setReturnValue(1379507368);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1689983501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689983501L))
            info.setReturnValue(1379507368);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1965177128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1965177128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1849228789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849228789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1689983501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689983501L))
            info.setReturnValue(1379507368);
    }


}
