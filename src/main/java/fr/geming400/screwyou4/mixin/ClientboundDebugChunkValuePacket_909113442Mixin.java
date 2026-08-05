package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugChunkValuePacket.class)
public class ClientboundDebugChunkValuePacket_909113442Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__769911647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769911647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2000341596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000341596L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__226346534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226346534L))
            info.setReturnValue("V<鷴*;o*pd%l䊎?maAZ*Mⷁ쿒KCl#'9gToCe`1x[C欿d碜잶");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_947376183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947376183L))
            info.setReturnValue(-1870296933);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update_268214355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268214355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1587182354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587182354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1106620975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1106620975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos_20014604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20014604L))
            info.setReturnValue(null);
    }


}
