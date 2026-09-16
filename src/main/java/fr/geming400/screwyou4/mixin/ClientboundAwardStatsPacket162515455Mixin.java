package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAwardStatsPacket.class)
public class ClientboundAwardStatsPacket162515455Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_318383045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318383045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__746110813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746110813L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_932938980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932938980L))
            info.setReturnValue("\"#\u4173b/o\u9692t #tQsC;\u7717+!9\u7A6C9Hk*[<EsB\uBE211l>2\uBB0Ap`/qirsy\u2829xKI]\uBC90b9fE;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_719867546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719867546L))
            info.setReturnValue(-616450967);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__133196408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-133196408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1428962139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1428962139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stats()Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private void stats_205540052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205540052L))
            info.setReturnValue(null);
    }


}
