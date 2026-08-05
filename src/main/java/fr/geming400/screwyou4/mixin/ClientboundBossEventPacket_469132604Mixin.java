package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBossEventPacket.class)
public class ClientboundBossEventPacket_469132604Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_625000193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625000193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket$Handler;)V", cancellable = true)
    private void dispatch_1410036864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1410036864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1122344991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1122344991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_173420740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(173420740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAddPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createAddPacket__1985863332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985863332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateNamePacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateNamePacket__476708175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476708175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateStylePacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateStylePacket_440522613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440522613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdateProgressPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdateProgressPacket__280673329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280673329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRemovePacket(Ljava/util/UUID;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createRemovePacket__617141896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617141896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUpdatePropertiesPacket(Lnet/minecraft/world/BossEvent;)Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;", cancellable = true)
    private static void createUpdatePropertiesPacket_1199393993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199393993L))
            info.setReturnValue(null);
    }


}
