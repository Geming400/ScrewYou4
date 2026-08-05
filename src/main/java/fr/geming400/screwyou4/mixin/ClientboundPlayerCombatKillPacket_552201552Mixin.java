package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatKillPacket.class)
public class ClientboundPlayerCombatKillPacket_552201552Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1126823537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126823537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1937713810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937713810L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__583258424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583258424L))
            info.setReturnValue("jjGbN蜬j9l3%u$/$Q⛧b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_590464293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590464293L))
            info.setReturnValue(-278499730);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1624707614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1624707614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1230270464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230270464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_749709085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(749709085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerId()I", cancellable = true)
    private void playerId_590463797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590463797L))
            info.setReturnValue(-75352311);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_590480134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590480134L))
            info.setReturnValue(false);
    }


}
