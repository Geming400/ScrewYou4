package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket.class)
public class ClientboundUpdateMobEffectPacket52701887Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_208569477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208569477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1538775707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1538775707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__243009976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243009976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getEffect__387025580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387025580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffectDurationTicks()I", cancellable = true)
    private void getEffectDurationTicks__1661035126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661035126L))
            info.setReturnValue(1334767060);
    }

    @Inject(at = @At("HEAD"), method = "getEffectAmplifier()I", cancellable = true)
    private void getEffectAmplifier__1218937541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218937541L))
            info.setReturnValue(824029805);
    }

    @Inject(at = @At("HEAD"), method = "isEffectAmbient()Z", cancellable = true)
    private void isEffectAmbient_1938488281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938488281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldBlend()Z", cancellable = true)
    private void shouldBlend_497080536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497080536L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEffectVisible()Z", cancellable = true)
    private void isEffectVisible_1063425599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063425599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId__582039727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582039727L))
            info.setReturnValue(1406174948);
    }

    @Inject(at = @At("HEAD"), method = "effectShowsIcon()Z", cancellable = true)
    private void effectShowsIcon__88486120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88486120L))
            info.setReturnValue(true);
    }


}
