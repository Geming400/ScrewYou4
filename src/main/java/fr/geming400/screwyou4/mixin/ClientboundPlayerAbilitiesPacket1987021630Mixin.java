package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket.class)
public class ClientboundPlayerAbilitiesPacket1987021630Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2142889220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142889220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1691309767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1691309767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_395544036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395544036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canInstabuild()Z", cancellable = true)
    private void canInstabuild__1852695950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852695950L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFly()Z", cancellable = true)
    private void canFly__644745134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644745134L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerable()Z", cancellable = true)
    private void isInvulnerable_400979678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400979678L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWalkingSpeed()F", cancellable = true)
    private void getWalkingSpeed__1265447011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265447011L))
            info.setReturnValue(8.458434E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFlyingSpeed()F", cancellable = true)
    private void getFlyingSpeed_1278925151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278925151L))
            info.setReturnValue(8.458434E8F);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying__1590973380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590973380L))
            info.setReturnValue(false);
    }


}
