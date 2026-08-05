package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundUseItemPacket.class)
public class ServerboundUseItemPacket_766824311Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__912200778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912200778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1101797684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1101797684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1444893223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444893223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence_805086556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805086556L))
            info.setReturnValue(704081374);
    }

    @Inject(at = @At("HEAD"), method = "getYRot()F", cancellable = true)
    private void getYRot_805083673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805083673L))
            info.setReturnValue(7.321514E8F);
    }

    @Inject(at = @At("HEAD"), method = "getXRot()F", cancellable = true)
    private void getXRot_805083673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805083673L))
            info.setReturnValue(7.321514E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand_1620813034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620813034L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
