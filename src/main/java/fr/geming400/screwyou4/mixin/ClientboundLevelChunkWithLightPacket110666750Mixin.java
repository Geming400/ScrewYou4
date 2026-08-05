package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket.class)
public class ClientboundLevelChunkWithLightPacket110666750Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1568358338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568358338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_308174284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308174284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_788735663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788735663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_148928996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148928996L))
            info.setReturnValue(-1459725399);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_148928996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148928996L))
            info.setReturnValue(-1459725399);
    }

    @Inject(at = @At("HEAD"), method = "getLightData()Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacketData;", cancellable = true)
    private void getLightData__663690765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663690765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkData()Lnet/minecraft/network/protocol/game/ClientboundLevelChunkPacketData;", cancellable = true)
    private void getChunkData__744408273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744408273L))
            info.setReturnValue(null);
    }


}
