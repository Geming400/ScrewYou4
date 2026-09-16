package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ping.ClientboundPongResponsePacket.class)
public class ClientboundPongResponsePacket_203180970Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_359048559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(359048559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__705445299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705445299L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_973604494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973604494L))
            info.setReturnValue("\u64AD:;,\u3DBEMqoZ.9!\u8CC7\u3BB3us{RN}U4\u9859kToo,_*c\u54AEg\uC64B^L?O5713$Jt=pOjoQ&C!\u0254mx5NcH&O!\uBBD5?]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_760533060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760533060L))
            info.setReturnValue(-148643829);
    }

    @Inject(at = @At("HEAD"), method = "time()J", cancellable = true)
    private void time_186813091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186813091L))
            info.setReturnValue(9025337403114920320L);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__92530894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-92530894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/ping/ClientPongPacketListener;)V", cancellable = true)
    private void handle_1191777801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1191777801L))
            info.cancel();
    }


}
