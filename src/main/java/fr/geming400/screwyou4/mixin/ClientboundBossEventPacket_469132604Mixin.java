package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBossEventPacket.class)
public class ClientboundBossEventPacket_469132604Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1209892485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209892485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket$Handler;)V", cancellable = true)
    private void dispatch__1139453254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1139453254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_666640137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666640137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1147201516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147201516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAddPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createAddPacket__596732055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596732055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRemovePacket(Ljava/util/UUID;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createRemovePacket__1168456656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168456656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateProgressPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateProgressPacket__596732055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596732055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateNamePacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateNamePacket__596732055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596732055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateStylePacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateStylePacket__596732055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596732055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdatePropertiesPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdatePropertiesPacket__596732055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596732055L))
            info.setReturnValue(null);
    }


}
