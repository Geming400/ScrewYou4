package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket.class)
public class ClientboundPlayerAbilitiesPacket1987021630Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_307996542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307996542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1629876753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1629876753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2110438132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2110438132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerable()Z", cancellable = true)
    private void isInvulnerable_2025300213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025300213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyingSpeed()F", cancellable = true)
    private void getFlyingSpeed_2025280993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025280993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_2025300213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025300213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canInstabuild()Z", cancellable = true)
    private void canInstabuild_2025300213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025300213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkingSpeed()F", cancellable = true)
    private void getWalkingSpeed_2025280993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025280993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canFly()Z", cancellable = true)
    private void canFly_2025300213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025300213L))
            info.setReturnValue(null);
    }


}
