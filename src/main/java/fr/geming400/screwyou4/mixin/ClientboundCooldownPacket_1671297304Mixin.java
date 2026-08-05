package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCooldownPacket.class)
public class ClientboundCooldownPacket_1671297304Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__7727785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7727785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1238157734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238157734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_535837328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535837328L))
            info.setReturnValue(")L왖h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1709560045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709560045L))
            info.setReturnValue(-606014425);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_1709559549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709559549L))
            info.setReturnValue(-1978798501);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1945601080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1945601080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1868804837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1868804837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cooldownGroup()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void cooldownGroup__771769250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771769250L))
            info.setReturnValue(null);
    }


}
