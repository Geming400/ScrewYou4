package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPickItemFromBlockPacket.class)
public class ServerboundPickItemFromBlockPacket_2022111058Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_343085969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343085969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__887343980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887343980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_886651082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886651082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2060373799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060373799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_128724178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128724178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1594787326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1594787326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_153489063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(153489063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeData()Z", cancellable = true)
    private void includeData_2060389640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060389640L))
            info.setReturnValue(null);
    }


}
