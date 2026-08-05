package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChangeGameModePacket.class)
public class ServerboundChangeGameModePacket_787613878Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void mode__1601777346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601777346L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_943481467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943481467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__121012391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121012391L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1558037402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558037402L))
            info.setReturnValue("TA1ar[\uD587C}ll:p_]|81lrma/0U^3qAeL\"'i,7PKOHS^\uC35AbR.k\u323C/5PH.bm)O\u5A9A8L\u82E3|\u2810\u6DC2*#w\uA292%,qB8xe+d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1344965968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344965968L))
            info.setReturnValue(-442964036);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_491902014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(491902014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1424974051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1424974051L))
            info.cancel();
    }


}
