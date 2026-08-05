package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.class)
public class ServerboundPlayerActionPacket542581228Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1136443860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136443860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1326040766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1326040766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1220650141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1220650141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSequence()I", cancellable = true)
    private void getSequence_580843474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580843474L))
            info.setReturnValue(-2012590637);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection__220274057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220274057L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1350805651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350805651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket$Action;", cancellable = true)
    private void getAction__330420961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330420961L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action.DROP_ITEM);
    }


}
