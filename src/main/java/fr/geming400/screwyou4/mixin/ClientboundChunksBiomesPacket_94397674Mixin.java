package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket.class)
public class ClientboundChunksBiomesPacket_94397674Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_250265263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250265263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__814228595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814228595L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_864821198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864821198L))
            info.setReturnValue("FFPn*`dN;s\u15442@\u54A0PNy;%2O\u932De+Ugb<(YFX`Q_B5vMW$A\u2B1E$h?*5U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_651749764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651749764L))
            info.setReturnValue(-1313090986);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__201314190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-201314190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1497079921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1497079921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chunkBiomeData()Ljava/util/List;", cancellable = true)
    private void chunkBiomeData__1433331946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433331946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forChunks(Ljava/util/List;)Lnet/minecraft/network/protocol/game/ClientboundChunksBiomesPacket;", cancellable = true)
    private static void forChunks_1203829070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203829070L))
            info.setReturnValue(null);
    }


}
