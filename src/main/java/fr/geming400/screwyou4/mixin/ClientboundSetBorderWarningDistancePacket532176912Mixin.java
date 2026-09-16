package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderWarningDistancePacket.class)
public class ClientboundSetBorderWarningDistancePacket532176912Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_688044502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688044502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_236465049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(236465049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1059300682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1059300682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWarningBlocks()I", cancellable = true)
    private void getWarningBlocks_900639978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900639978L))
            info.setReturnValue(1277593251);
    }


}
