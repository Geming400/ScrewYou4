package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRespawnPacket.class)
public class ClientboundRespawnPacket_527382769Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_683250358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683250358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__381243500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381243500L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1297806293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297806293L))
            info.setReturnValue("D-7Xo^\u08CB\u3E19\u9D7D.v\u0C32O_\u27517pkrz7ZjDvn!t\u4C86'\u57E6\u168E(X\uA5AAQ#\u3609jyTj)4\u6B5BHr@oca^><tgtlP9by[`3zK%D^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1084734859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084734859L))
            info.setReturnValue(1313916970);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_231670905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231670905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1064094826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1064094826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dataToKeep()B", cancellable = true)
    private void dataToKeep__1629582875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629582875L))
            info.setReturnValue(25);
    }

    @Inject(at = @At("HEAD"), method = "commonPlayerSpawnInfo()Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void commonPlayerSpawnInfo__2044362155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2044362155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldKeep(B)Z", cancellable = true)
    private void shouldKeep__948310927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948310927L))
            info.setReturnValue(true);
    }


}
