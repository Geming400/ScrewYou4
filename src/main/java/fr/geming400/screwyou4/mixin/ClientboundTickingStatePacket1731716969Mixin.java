package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTickingStatePacket.class)
public class ClientboundTickingStatePacket1731716969Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1887584559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887584559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_823090701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823090701L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1792826802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792826802L))
            info.setReturnValue("qhNHQTZa^n@5OWFq<:c`^g/r)ry<W/GYe:0\uA666U3h*-K%g|s07f[gJ\u7513*&a\u14A51u \u6886ZWP)e?l\u37C9O;K]^J\u4774K\u7063[@lrV\u9E2CRw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2005898236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005898236L))
            info.setReturnValue(1836756337);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/world/TickRateManager;)Lnet/minecraft/network/protocol/game/ClientboundTickingStatePacket;", cancellable = true)
    private static void from__885274885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885274885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1436005106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1436005106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_140239375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140239375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFrozen()Z", cancellable = true)
    private void isFrozen__1764873482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764873482L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tickRate()F", cancellable = true)
    private void tickRate__758595569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758595569L))
            info.setReturnValue(9.678033E8F);
    }


}
