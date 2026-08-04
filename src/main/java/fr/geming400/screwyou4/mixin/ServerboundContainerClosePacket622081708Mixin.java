package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerClosePacket.class)
public class ServerboundContainerClosePacket622081708Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1056943380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056943380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1300150621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1300150621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1246540286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1246540286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_660343954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660343954L))
            info.setReturnValue(null);
    }


}
