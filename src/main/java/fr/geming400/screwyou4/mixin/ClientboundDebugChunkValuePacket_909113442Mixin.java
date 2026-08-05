package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugChunkValuePacket.class)
public class ClientboundDebugChunkValuePacket_909113442Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1064981031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064981031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_487173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1679536966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679536966L))
            info.setReturnValue("d\u9739jpVw-&i,\u43DFw&\uB43C!^j|8g>*y+8[8b)lwlFGI\uAF2Do\u980D\uC83CV:Rp:IC\u3E1EXr4BF7Ntu\uFB1Fb\u0C67=]*s\u958DTg\u465FEN\"&\u1727vV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1466465532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466465532L))
            info.setReturnValue(-797181448);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update_1472493930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472493930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_613401578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(613401578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__682364153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-682364153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__956508237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956508237L))
            info.setReturnValue(null);
    }


}
