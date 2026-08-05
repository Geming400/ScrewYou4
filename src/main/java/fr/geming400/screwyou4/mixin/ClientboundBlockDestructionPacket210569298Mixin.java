package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket.class)
public class ClientboundBlockDestructionPacket210569298Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1468455790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468455790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_248831544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248831544L))
            info.setReturnValue(1159212748);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_408076832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(408076832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_888638211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(888638211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1682817581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682817581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgress()I", cancellable = true)
    private void getProgress_248831544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248831544L))
            info.setReturnValue(1159212748);
    }


}
