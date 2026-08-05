package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTagQueryPacket.class)
public class ClientboundTagQueryPacket_1045396037Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__633629052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633629052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1242903570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1242903570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1723464949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1723464949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getTag__524826884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524826884L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_1083674619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083674619L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTransactionId()I", cancellable = true)
    private void getTransactionId_1083658282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083658282L))
            info.setReturnValue(68038824);
    }


}
