package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundStopSoundPacket.class)
public class ClientboundStopSoundPacket2037823940Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName__405242613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405242613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_358798852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358798852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1579074443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579074443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2059635822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059635822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource__255224033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255224033L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.MUSIC);
    }


}
