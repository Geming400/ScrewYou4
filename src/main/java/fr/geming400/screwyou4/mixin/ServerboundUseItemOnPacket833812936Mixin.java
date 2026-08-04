package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundUseItemOnPacket.class)
public class ServerboundUseItemOnPacket833812936Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__845212152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845212152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1034809058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1034809058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1511881849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511881849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence_872075182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872075182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getHand_1687801660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687801660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void getHitResult__2144217571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144217571L))
            info.setReturnValue(null);
    }


}
