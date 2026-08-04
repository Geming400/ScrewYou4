package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSoundPacket.class)
public class ClientboundSoundPacket740370726Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__938654362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938654362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_937878260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937878260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1418439639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1418439639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_778633933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778633933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY_778628167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778628167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource__1552677247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552677247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX_778628167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778628167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ_778628167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778628167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_778630089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778630089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume_778630089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778630089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSound__2005720798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005720798L))
            info.setReturnValue(null);
    }


}
