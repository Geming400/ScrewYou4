package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDamageEventPacket.class)
public class ClientboundDamageEventPacket_1706278702Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_27253613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27253613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1203176336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203176336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_570818726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570818726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1744541443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744541443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1910619682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1910619682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1903786235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1903786235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sourceType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sourceType__1039812823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039812823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSource(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getSource__1724711454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724711454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_1744540947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744540947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceDirectId()I", cancellable = true)
    private void sourceDirectId_1744540947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744540947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourceCauseId()I", cancellable = true)
    private void sourceCauseId_1744540947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744540947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePosition()Ljava/util/Optional;", cancellable = true)
    private void sourcePosition_1951740123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951740123L))
            info.setReturnValue(null);
    }


}
