package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket.class)
public class ClientboundBlockUpdatePacket1525452045Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1681319635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681319635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__66025549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-66025549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1229740182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1229740182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_2015017776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015017776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__159341195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159341195L))
            info.setReturnValue(null);
    }


}
