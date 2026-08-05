package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerCombatKillPacket.class)
public class ClientboundPlayerCombatKillPacket_552201552Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_708069141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708069141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__356424717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356424717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1322625076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322625076L))
            info.setReturnValue("6\uB6D491\u45AFp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1109553642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109553642L))
            info.setReturnValue(-913025587);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__954338007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954338007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_256489688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(256489688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1039276043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1039276043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_216731141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216731141L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playerId()I", cancellable = true)
    private void playerId_509992153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509992153L))
            info.setReturnValue(-483545509);
    }


}
