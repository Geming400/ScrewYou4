package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPickItemFromBlockPacket.class)
public class ServerboundPickItemFromBlockPacket_2022111058Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2116988649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116988649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1113484789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113484789L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1502432714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502432714L))
            info.setReturnValue("o{DacK=`_{<SrD+vV229}`6MT.jDvTG}:/:!B.K\u3298H[%u[f|0db}L#QH4\"SgCmhaK2bSYu\u9A13pK4pSb0W\uC6C0gtu\u8013Q35=)KcxZ =5B\u9743");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1715504148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715504148L))
            info.setReturnValue(1153906551);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__258665218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258665218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1726399194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726399194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1635496065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635496065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeData()Z", cancellable = true)
    private void includeData__19996714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19996714L))
            info.setReturnValue(false);
    }


}
