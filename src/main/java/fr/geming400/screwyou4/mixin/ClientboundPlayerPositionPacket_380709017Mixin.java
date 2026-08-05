package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket.class)
public class ClientboundPlayerPositionPacket_380709017Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_536576606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536576606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__527917252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527917252L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1151132541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151132541L))
            info.setReturnValue("O9:m\u105B^jdBlR\uFB6Ac}7'aZ7Rr\uFEC4F{[\u8C48j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_938061107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938061107L))
            info.setReturnValue(1568047967);
    }

    @Inject(at = @At("HEAD"), method = "of(ILnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;", cancellable = true)
    private static void of__1146919253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146919253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1980492355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980492355L))
            info.setReturnValue(-1860032135);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_84997153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(84997153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1210768578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1210768578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "change()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void change_582834169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582834169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives_141964339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141964339L))
            info.setReturnValue(null);
    }


}
