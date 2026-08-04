package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChangeDifficultyPacket.class)
public class ClientboundChangeDifficultyPacket1042292744Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__636732344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636732344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1867162293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867162293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__93167231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93167231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1080555486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080555486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1720361657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1720361657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1239800278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239800278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty__29459926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-29459926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1080571327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080571327L))
            info.setReturnValue(null);
    }


}
