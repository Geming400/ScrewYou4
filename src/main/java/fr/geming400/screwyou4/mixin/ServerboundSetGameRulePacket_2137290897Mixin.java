package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetGameRulePacket.class)
public class ServerboundSetGameRulePacket_2137290897Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2001808810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001808810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1228664628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228664628L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1387252875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387252875L))
            info.setReturnValue("mr-\u189A\"nWmnf*Kh%HeGcg'qsJ9dg04Hw]\u08DA&\u4871*Qv\u92F0[t#gRR--K<1h+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1600324309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600324309L))
            info.setReturnValue(-1842306560);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1860762800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860762800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1841579033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1841579033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1520316226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1520316226L))
            info.cancel();
    }


}
