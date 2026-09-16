package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenScreenPacket.class)
public class ClientboundOpenScreenPacket_1428120317Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1583987906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583987906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/inventory/MenuType;", cancellable = true)
    private void getType__1578050979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578050979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1132408453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1132408453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__163357278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-163357278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__961285028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961285028L))
            info.setReturnValue(54743558);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle_1832796593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832796593L))
            info.setReturnValue(null);
    }


}
