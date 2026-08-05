package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenScreenPacket.class)
public class ClientboundOpenScreenPacket_1428120317Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__250904772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250904772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/inventory/MenuType;", cancellable = true)
    private void getType__1346655571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346655571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2106189229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106189229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1625627850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1625627850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle__748788849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748788849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1466382562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466382562L))
            info.setReturnValue(-2147392202);
    }


}
