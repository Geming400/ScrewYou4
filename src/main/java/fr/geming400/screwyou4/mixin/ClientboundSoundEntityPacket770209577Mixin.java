package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSoundEntityPacket.class)
public class ClientboundSoundEntityPacket770209577Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__908815511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908815511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_808471823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808471823L))
            info.setReturnValue(1700798363);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1448278490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1448278490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_967717111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(967717111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_808472784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808472784L))
            info.setReturnValue(-9024549122804431348L);
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource__1522838396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522838396L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.WEATHER);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume_808468940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808468940L))
            info.setReturnValue(6.254877E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_808468940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808468940L))
            info.setReturnValue(6.254877E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSound__1975881947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975881947L))
            info.setReturnValue(null);
    }


}
