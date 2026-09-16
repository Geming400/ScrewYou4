package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelEventPacket.class)
public class ClientboundLevelEventPacket35357475Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_191225065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191225065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()I", cancellable = true)
    private void getType_492089177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492089177L))
            info.setReturnValue(-189905097);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1556120119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1556120119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__260354388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-260354388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData__390654743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390654743L))
            info.setReturnValue(2030409412);
    }

    @Inject(at = @At("HEAD"), method = "isGlobalEvent()Z", cancellable = true)
    private void isGlobalEvent__55024691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55024691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_524923206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524923206L))
            info.setReturnValue(null);
    }


}
