package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSelectAdvancementsTabPacket.class)
public class ClientboundSelectAdvancementsTabPacket_364370563Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_520238152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520238152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_68658699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(68658699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1227107032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1227107032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTab()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTab_1407320872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407320872L))
            info.setReturnValue(null);
    }


}
