package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetDataPacket.class)
public class ClientboundContainerSetDataPacket_1651721256Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1807588845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807588845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue__950698190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950698190L))
            info.setReturnValue(1902579913);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__6602340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6602340L))
            info.setReturnValue(-1257166747);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1356009392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356009392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_60243661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60243661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__737684089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737684089L))
            info.setReturnValue(-964078107);
    }


}
