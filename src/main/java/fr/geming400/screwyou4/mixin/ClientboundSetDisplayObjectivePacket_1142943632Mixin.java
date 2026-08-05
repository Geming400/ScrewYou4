package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetDisplayObjectivePacket.class)
public class ClientboundSetDisplayObjectivePacket_1142943632Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1298811221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298811221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void getSlot__794754610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794754610L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_YELLOW);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_847231768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(847231768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__448533963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-448533963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveName()Ljava/lang/String;", cancellable = true)
    private void getObjectiveName__1139722170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139722170L))
            info.setReturnValue("-}XH\u0E15(m%/S$\uB9F1_\u08B3X'7ywhs\u7A08bZ\u42A0zI&T%lYAM\u5FB8H-r:j\uBA231HleN]q\u2FD2s%\u03B1=dG`>g\uCE64&H\u3BF8#\uCDA2^nx\uB02B\u8838");
    }


}
