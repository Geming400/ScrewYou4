package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTimePacket.class)
public class ClientboundSetTimePacket929064246Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1084931836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084931836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_20437978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20437978L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1699487771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699487771L))
            info.setReturnValue(".u/Ruj}npFYPF\u2999!\uD63A70\u3976pqmG|-ZGV=\u2C6FY!\u909BhE&3>FjM\u3C61Zz+X\uCDF9*1A\uCF66C\u21DE\u201F&uk@h\u958E\u0CA1Tp]GNo\"AsU;|mSxs#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1486416337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486416337L))
            info.setReturnValue(-344326059);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_633352383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633352383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__662413348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-662413348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clockUpdates()Ljava/util/Map;", cancellable = true)
    private void clockUpdates_410250690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410250690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameTime()J", cancellable = true)
    private void gameTime_1429850206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429850206L))
            info.setReturnValue(-6083269865789037821L);
    }


}
