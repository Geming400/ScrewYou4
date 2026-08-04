package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundOpenSignEditorPacket.class)
public class ClientboundOpenSignEditorPacket_1019159135Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__659865954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659865954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1216666668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1216666668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1697228047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1697228047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__874227745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874227745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFrontText()Z", cancellable = true)
    private void isFrontText_1057437717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057437717L))
            info.setReturnValue(null);
    }


}
