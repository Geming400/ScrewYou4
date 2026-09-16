package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockEventPacket.class)
public class ClientboundBlockEventPacket_931393350Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1087260939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087260939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__660084245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-660084245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_635681486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(635681486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBlock_2134495555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134495555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getB0()I", cancellable = true)
    private void getB0_161762727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161762727L))
            info.setReturnValue(1308701592);
    }

    @Inject(at = @At("HEAD"), method = "getB1()I", cancellable = true)
    private void getB1_190391878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190391878L))
            info.setReturnValue(-692686907);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1420959080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420959080L))
            info.setReturnValue(null);
    }


}
