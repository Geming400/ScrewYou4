package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerLoadedPacket.class)
public class ServerboundPlayerLoadedPacket852595915Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__826429173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826429173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2056859122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056859122L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__282864060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282864060L))
            info.setReturnValue("j'ly<Ez 8)j㍤,yvJO5a茜TC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_890858657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890858657L))
            info.setReturnValue(-1456339741);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1530664828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1530664828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1016026079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1016026079L))
            info.cancel();
    }


}
