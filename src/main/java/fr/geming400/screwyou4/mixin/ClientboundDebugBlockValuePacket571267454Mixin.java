package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugBlockValuePacket.class)
public class ClientboundDebugBlockValuePacket571267454Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1107757634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107757634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1956779713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956779713L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__564192521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564192521L))
            info.setReturnValue("FjB{*w\u9A78Ive`\u4918\"!3<`sh\uCB5ChXH?LdSO'@f0s\u6F7BpbR&lA?\u5BF7eM-ly\uA4F3%!/8i0>.\uFC4BRR\u30FDNc6\uC84BszpB/K'gKq:&\u19B2B+z<\uAE6E-1A\u9DED\u2D8DhgSRB\u5C0F\"e[l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_609530196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609530196L))
            info.setReturnValue(1053364310);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update__69631632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-69631632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1249336367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1249336367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_768774988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768774988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPos__1322119425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322119425L))
            info.setReturnValue(null);
    }


}
