package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerButtonClickPacket.class)
public class ServerboundContainerButtonClickPacket1667507898Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__11517190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11517190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1241947139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1241947139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_532047923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532047923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1705770640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705770640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1949390485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949390485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__201114096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-201114096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buttonId()I", cancellable = true)
    private void buttonId_1705770144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705770144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_1705770144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705770144L))
            info.setReturnValue(null);
    }


}
