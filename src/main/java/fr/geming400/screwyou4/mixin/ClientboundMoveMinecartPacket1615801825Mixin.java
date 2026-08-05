package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveMinecartPacket.class)
public class ClientboundMoveMinecartPacket1615801825Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__63223263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63223263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1293653212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293653212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_480341850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480341850L))
            info.setReturnValue("\uC5CCy\uB778Bp\u4E98SmmM!\u9B6Dq%u)L ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1654064567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654064567L))
            info.setReturnValue(-775149243);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1813309359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1813309359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2001096558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2001096558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_1257035670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1257035670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerpSteps()Ljava/util/List;", cancellable = true)
    private void lerpSteps__1052828655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052828655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_1654064071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654064071L))
            info.setReturnValue(-596625753);
    }


}
