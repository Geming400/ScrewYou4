package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTickingStepPacket.class)
public class ClientboundTickingStepPacket1492212728Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__186812360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186812360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1417242309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417242309L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_356752753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356752753L))
            info.setReturnValue("FOA\u2493vNy%X]qQ<t|yQy 80WE/[$1Z1$\"Z9841Fd 6\u4F3A%\u23574\u53C18lb0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1530475470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530475470L))
            info.setReturnValue(197801248);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/world/TickRateManager;)Lnet/minecraft/network/protocol/game/ClientboundTickingStepPacket;", cancellable = true)
    private static void from__599168283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599168283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1689720262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1689720262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2124685655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2124685655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickSteps()I", cancellable = true)
    private void tickSteps_1530474974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530474974L))
            info.setReturnValue(400948667);
    }


}
