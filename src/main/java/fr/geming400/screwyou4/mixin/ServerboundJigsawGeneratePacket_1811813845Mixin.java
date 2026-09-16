package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundJigsawGeneratePacket.class)
public class ServerboundJigsawGeneratePacket_1811813845Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1967681434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967681434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1845793278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845793278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1516101981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1516101981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()I", cancellable = true)
    private void levels_142287787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142287787L))
            info.setReturnValue(-1201626885);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1993587721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993587721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keepJigsaws()Z", cancellable = true)
    private void keepJigsaws__2035772866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035772866L))
            info.setReturnValue(true);
    }


}
