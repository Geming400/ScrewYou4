package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundUseItemPacket.class)
public class ServerboundUseItemPacket_766824311Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_922691900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922691900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1404184484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1404184484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_471112447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(471112447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence__1124754811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124754811L))
            info.setReturnValue(350533350);
    }

    @Inject(at = @At("HEAD"), method = "getXRot()F", cancellable = true)
    private void getXRot__1419490172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419490172L))
            info.setReturnValue(6.845701E8F);
    }

    @Inject(at = @At("HEAD"), method = "getYRot()F", cancellable = true)
    private void getYRot_1068022661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068022661L))
            info.setReturnValue(6.845701E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__1024392795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024392795L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
