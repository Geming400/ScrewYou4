package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetDefaultSpawnPositionPacket.class)
public class ClientboundSetDefaultSpawnPositionPacket2026446700Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2112653006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112653006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1117820432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117820432L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1498097071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498097071L))
            info.setReturnValue("s>x{XC\u4DC99E/1x=\u2AA1<\uC849o{11nk$\u188C5k^\u30F88<2xu\u30C14V[d>mF{X{_NlK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1711168505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711168505L))
            info.setReturnValue(-2145994512);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1730734837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1730734837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_434969106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434969106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "respawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void respawnData_988050098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988050098L))
            info.setReturnValue(null);
    }


}
