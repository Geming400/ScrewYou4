package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveMinecartPacket.class)
public class ClientboundMoveMinecartPacket1615801825Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1771669415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771669415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_707175557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707175557L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1908741946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908741946L))
            info.setReturnValue("70 \u0D78<g_0Ii&eO[CRI*|?;CsfZEU2uk?W\u0DD92hZ\u85E6M5<i$Lgr3?ic- dbd(60*&'\u46355b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2121813380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121813380L))
            info.setReturnValue(-1059208674);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_24324231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(24324231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1320089962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1320089962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1239241361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239241361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerpSteps()Ljava/util/List;", cancellable = true)
    private void lerpSteps_1539332097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539332097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_2098859561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098859561L))
            info.setReturnValue(91173301);
    }


}
