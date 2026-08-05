package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundCustomClickActionPacket.class)
public class ServerboundCustomClickActionPacket1843904154Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Ljava/util/Optional;", cancellable = true)
    private void payload_2089365576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089365576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_164879066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164879066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1065550883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065550883L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_708444179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708444179L))
            info.setReturnValue("e_Aiu SꦄWb;Az:+zMsR赖:@|*}B(K5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1882166896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882166896L))
            info.setReturnValue(441537708);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__599162399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599162399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__891931056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-891931056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1772994229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1772994229L))
            info.cancel();
    }


}
