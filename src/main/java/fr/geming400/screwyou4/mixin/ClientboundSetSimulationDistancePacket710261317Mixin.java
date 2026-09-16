package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetSimulationDistancePacket.class)
public class ClientboundSetSimulationDistancePacket710261317Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_866128907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866128907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__198364951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198364951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1480684842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480684842L))
            info.setReturnValue("Q`H#jTnR\uA898gS\u7664\u5F85t$N\uC676>J8?2h*5C+DU\u5714hr&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1267613408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267613408L))
            info.setReturnValue(-1105911408);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__881216277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-881216277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_414549454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(414549454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance_1157268111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157268111L))
            info.setReturnValue(-1993308556);
    }


}
