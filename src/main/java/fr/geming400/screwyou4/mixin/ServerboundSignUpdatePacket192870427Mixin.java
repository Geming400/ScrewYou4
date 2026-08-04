package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSignUpdatePacket.class)
public class ServerboundSignUpdatePacket192870427Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1486154661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486154661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1675751567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1675751567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_870939340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(870939340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLines()[Ljava/lang/String;", cancellable = true)
    private void getLines_1542903709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542903709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1700516452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700516452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFrontText()Z", cancellable = true)
    private void isFrontText_231149010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231149010L))
            info.setReturnValue(null);
    }


}
