package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTickingStatePacket.class)
public class ClientboundTickingStatePacket1731716969Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_52691881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52691881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1177738068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177738068L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_596256994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596256994L))
            info.setReturnValue("@qz`CUM\u7488aP1 MZ k\u79DF[@\uC629N2@\u52E75.&Zyglc\u6444`*5\uB713zm&<?$5q\u6FD07{(\uCF17[&'mRmI02;0pxz\uB98DHxAhp y9y\uBFE6G]F9JRog2q\u98ECe{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1769979711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769979711L))
            info.setReturnValue(297014604);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/world/TickRateManager;)Lnet/minecraft/network/protocol/game/ClientboundTickingStatePacket;", cancellable = true)
    private static void from_1202411089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202411089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1885181414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885181414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1929224503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1929224503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFrozen()Z", cancellable = true)
    private void isFrozen_1769995552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769995552L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickRate()F", cancellable = true)
    private void tickRate_1769976332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769976332L))
            info.setReturnValue(7.120542E8F);
    }


}
