package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTimePacket.class)
public class ClientboundSetTimePacket929064246Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__749960842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749960842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1980390791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980390791L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__206395729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206395729L))
            info.setReturnValue("\uACE7\u4BE9UfM5lg;8-?U\u3C1Bl]D{=\u4D5C5\u3B7Bz(-\"rO_\u2DBEF]T6\uB355HG\uCD8E/Pt!\u1070");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_967326988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967326988L))
            info.setReturnValue(-2095211494);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1607133159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1607133159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1126571780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1126571780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gameTime()J", cancellable = true)
    private void gameTime_967327453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967327453L))
            info.setReturnValue(8294422416727674149L);
    }

    @Inject(at = @At("HEAD"), method = "clockUpdates()Ljava/util/Map;", cancellable = true)
    private void clockUpdates__1075559394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075559394L))
            info.setReturnValue(null);
    }


}
