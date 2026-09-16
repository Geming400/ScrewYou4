package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSoundEntityPacket.class)
public class ClientboundSoundEntityPacket770209577Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_926077167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926077167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__888114018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888114018L))
            info.setReturnValue(30828480);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_474497714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(474497714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__821268017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-821268017L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_1336693321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336693321L))
            info.setReturnValue(-8399138997091731091L);
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource__1091368235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091368235L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.BLOCKS);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_120405634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120405634L))
            info.setReturnValue(6.976259E8F);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume__797834820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797834820L))
            info.setReturnValue(6.976259E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSound_885806252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885806252L))
            info.setReturnValue(null);
    }


}
