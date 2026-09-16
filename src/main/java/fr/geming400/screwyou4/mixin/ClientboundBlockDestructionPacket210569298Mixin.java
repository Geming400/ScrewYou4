package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket.class)
public class ClientboundBlockDestructionPacket210569298Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_366436888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366436888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1447754297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447754297L))
            info.setReturnValue(-1584174644);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1380908296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1380908296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__85142565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-85142565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress()I", cancellable = true)
    private void getProgress__179098507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179098507L))
            info.setReturnValue(-1989109858);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_700135029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700135029L))
            info.setReturnValue(null);
    }


}
