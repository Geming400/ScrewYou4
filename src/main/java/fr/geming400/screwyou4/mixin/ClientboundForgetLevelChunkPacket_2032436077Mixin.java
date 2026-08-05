package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket.class)
public class ClientboundForgetLevelChunkPacket_2032436077Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_353410988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353410988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__877018961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877018961L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_896976101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896976101L))
            info.setReturnValue("0V\uD5BC\"R`2  D\u1CFA!Z/o\u52FE69xr0\u4B1C[X8I7\u0D7FMC0<P1&O[@\"8@q2\u6CC5YR2mVQd\uFA02O2y-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2070698818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070698818L))
            info.setReturnValue(733584828);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void pos_1143337239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143337239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1584462307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584462307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2065023686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2065023686L))
            info.cancel();
    }


}
