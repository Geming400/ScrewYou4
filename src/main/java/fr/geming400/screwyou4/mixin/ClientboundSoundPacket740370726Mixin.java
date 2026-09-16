package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSoundPacket.class)
public class ClientboundSoundPacket740370726Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_896238316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896238316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__851106868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-851106868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_444658863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(444658863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_1306854470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306854470L))
            info.setReturnValue(-8174237785584957231L);
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY_1643803236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643803236L))
            info.setReturnValue(2.088720080270266E7D);
    }

    @Inject(at = @At("HEAD"), method = "getSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSource__1121207086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121207086L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.NEUTRAL);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX_1615174085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615174085L))
            info.setReturnValue(2.088720041790519E7D);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ_1672432387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672432387L))
            info.setReturnValue(2.0887200720392775E7D);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_90566783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90566783L))
            info.setReturnValue(2.08872E7F);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume__827673671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827673671L))
            info.setReturnValue(2.08872E7F);
    }

    @Inject(at = @At("HEAD"), method = "getSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSound_855967401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855967401L))
            info.setReturnValue(null);
    }


}
