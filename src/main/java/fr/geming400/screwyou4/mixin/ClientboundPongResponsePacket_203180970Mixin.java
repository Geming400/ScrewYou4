package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ping.ClientboundPongResponsePacket.class)
public class ClientboundPongResponsePacket_203180970Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1475844119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475844119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1588693228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588693228L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__932279006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932279006L))
            info.setReturnValue("!-'H7(q:ꭊW0hfEQq1qi3WQ?AiHhB疕");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_241443711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241443711L))
            info.setReturnValue(463231122);
    }

    @Inject(at = @At("HEAD"), method = "time()J", cancellable = true)
    private void time_241444176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241444176L))
            info.setReturnValue(-2060243040745098378L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_881249882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(881249882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/ping/ClientPongPacketListener;)V", cancellable = true)
    private void handle__1314204367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1314204367L))
            info.cancel();
    }


}
