package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRenameItemPacket.class)
public class ServerboundRenameItemPacket458920870Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__676539601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676539601L))
            info.setReturnValue("Krrrn\u4212\uBC3EjMKf");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1220104218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220104218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1409701124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409701124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1136989783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1136989783L))
            info.cancel();
    }


}
