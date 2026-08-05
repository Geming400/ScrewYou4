package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTagQueryPacket.class)
public class ClientboundTagQueryPacket_1045396037Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1201263626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201263626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__546081558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-546081558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_749684173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(749684173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getTag_260791320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260791320L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId__1934422745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934422745L))
            info.setReturnValue(-1461341905);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_709925626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709925626L))
            info.setReturnValue(true);
    }


}
