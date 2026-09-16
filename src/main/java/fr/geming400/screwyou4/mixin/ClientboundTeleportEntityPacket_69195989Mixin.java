package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket.class)
public class ClientboundTeleportEntityPacket_69195989Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_225063578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225063578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__839430280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839430280L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_839619513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839619513L))
            info.setReturnValue("QY7+c=O[s)K\uAB457F<L-\u8BCDX@qGm {kO7^^\uC6BF!/EP-m;1\u84B1Ms\uC947+Cq\u0C90.8V\u75AAdz2hrDzf\u13E9GlX;qP<(,YmO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_626548079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626548079L))
            info.setReturnValue(-353250525);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1668979327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668979327L))
            info.setReturnValue(-102625674);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1522281606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522281606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__226515875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-226515875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "change()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void change_271321141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271321141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives__169548689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169548689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(ILnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;Z)Lnet/minecraft/network/protocol/game/ClientboundTeleportEntityPacket;", cancellable = true)
    private static void teleport_1866513079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866513079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround__53052923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53052923L))
            info.setReturnValue(false);
    }


}
