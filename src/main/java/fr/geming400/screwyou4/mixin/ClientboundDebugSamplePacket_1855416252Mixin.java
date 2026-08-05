package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugSamplePacket.class)
public class ClientboundDebugSamplePacket_1855416252Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_176391163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(176391163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1054038786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054038786L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_719956276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719956276L))
            info.setReturnValue("r&2?(S]{M!kkVkJ!eMh\u3D3E\u12A0\u7405y*X\uD08F[=*\u96032[y\u8CAFf\u2A3B3:FU<OS7lX:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1893678993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893678993L))
            info.setReturnValue(94939728);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2052923785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052923785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1761482132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1761482132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sample()[J", cancellable = true)
    private void sample__1253708727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253708727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugSampleType()Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private void debugSampleType__1678458823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678458823L))
            info.setReturnValue(net.minecraft.util.debugchart.RemoteDebugSampleType.TICK_TIME);
    }


}
