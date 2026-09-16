package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundUseItemOnPacket.class)
public class ServerboundUseItemOnPacket833812936Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_989680526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989680526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1471173110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1471173110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_538101073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(538101073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence__1057766185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057766185L))
            info.setReturnValue(1046837444);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void getHitResult__1493585533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493585533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand__957404169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957404169L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }


}
