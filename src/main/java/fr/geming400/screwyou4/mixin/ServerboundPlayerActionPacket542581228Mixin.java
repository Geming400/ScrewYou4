package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.class)
public class ServerboundPlayerActionPacket542581228Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_698448818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698448818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1179941402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179941402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_246869365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246869365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence__1348997893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348997893L))
            info.setReturnValue(-1290389346);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection_1337780480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337780480L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1032146959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032146959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private void getAction__882511541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882511541L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.SWAP_ITEM_WITH_OFFHAND);
    }


}
