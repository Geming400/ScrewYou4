package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundStopSoundPacket.class)
public class ClientboundStopSoundPacket2037823940Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName_1276939020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276939020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2101275766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101275766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1742112077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1742112077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_446346346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(446346346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource_176246128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(176246128L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.RECORDS);
    }


}
