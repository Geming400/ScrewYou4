package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockEventPacket.class)
public class ClientboundBlockEventPacket_931393350Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__747631739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747631739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1128900883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1128900883L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1609462262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1609462262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBlock_174128250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174128250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__961993530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961993530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getB1()I", cancellable = true)
    private void getB1_969655595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969655595L))
            info.setReturnValue(794203802);
    }

    @Inject(at = @At("HEAD"), method = "getB0()I", cancellable = true)
    private void getB0_969655595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969655595L))
            info.setReturnValue(794203802);
    }


}
