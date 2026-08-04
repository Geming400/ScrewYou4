package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket.class)
public class ClientboundUpdateMobEffectPacket52701887Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1626323201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626323201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_730770800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(730770800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_250209421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250209421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getEffect_1601577659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601577659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_90964133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90964133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffectDurationTicks()I", cancellable = true)
    private void getEffectDurationTicks_90964133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90964133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffectAmplifier()I", cancellable = true)
    private void getEffectAmplifier_90964133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90964133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEffectAmbient()Z", cancellable = true)
    private void isEffectAmbient_90980470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90980470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldBlend()Z", cancellable = true)
    private void shouldBlend_90980470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90980470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effectShowsIcon()Z", cancellable = true)
    private void effectShowsIcon_90980470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90980470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEffectVisible()Z", cancellable = true)
    private void isEffectVisible_90980470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90980470L))
            info.setReturnValue(null);
    }


}
