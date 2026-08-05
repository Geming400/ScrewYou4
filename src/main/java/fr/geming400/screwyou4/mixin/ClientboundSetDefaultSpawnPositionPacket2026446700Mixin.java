package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetDefaultSpawnPositionPacket.class)
public class ClientboundSetDefaultSpawnPositionPacket2026446700Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_347421612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347421612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__883008337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883008337L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_890986725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890986725L))
            info.setReturnValue("\u9690,NKf,J\u23D0T\u8259%<#Thq`p<i-S\uFA32iK\u75B1dSCS(+b\u3E81\u62C4?'$OuNT\uD346i8npeJI_AI84&e9\u3E4D)>Dw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2064709442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064709442L))
            info.setReturnValue(558407063);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1590451683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1590451683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2071013062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071013062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "respawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void respawnData_1435486820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435486820L))
            info.setReturnValue(null);
    }


}
