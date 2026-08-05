package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket.class)
public class ClientboundChunksBiomesPacket_94397674Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1584627415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584627415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1479909932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479909932L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1041062302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041062302L))
            info.setReturnValue("Azs謹bụ-Br7欫c-}?Iꚶ0h5Pf;0]NdT*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_132660415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132660415L))
            info.setReturnValue(-787794471);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_772466586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772466586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_291905207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(291905207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forChunks(Ljava/util/List;)Lnet/minecraft/network/protocol/game/ClientboundChunksBiomesPacket;", cancellable = true)
    private static void forChunks__429800451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429800451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkBiomeData()Ljava/util/List;", cancellable = true)
    private void chunkBiomeData_1720734489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720734489L))
            info.setReturnValue(null);
    }


}
