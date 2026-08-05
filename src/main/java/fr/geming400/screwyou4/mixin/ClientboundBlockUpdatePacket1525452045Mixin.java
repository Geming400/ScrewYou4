package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket.class)
public class ClientboundBlockUpdatePacket1525452045Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__153573043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153573043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1722959579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1722959579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2091446338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2091446338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__367934834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-367934834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__770306821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770306821L))
            info.setReturnValue(null);
    }


}
