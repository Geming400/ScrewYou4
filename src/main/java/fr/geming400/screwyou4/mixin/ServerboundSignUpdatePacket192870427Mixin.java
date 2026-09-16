package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSignUpdatePacket.class)
public class ServerboundSignUpdatePacket192870427Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_348738017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348738017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_830230601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830230601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__102841436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-102841436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLines()[Ljava/lang/String;", cancellable = true)
    private void getLines__379322316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379322316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFrontText()Z", cancellable = true)
    private void isFrontText_518366310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518366310L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_682436158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682436158L))
            info.setReturnValue(null);
    }


}
