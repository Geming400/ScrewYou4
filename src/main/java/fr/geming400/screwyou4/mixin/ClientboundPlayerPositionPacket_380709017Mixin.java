package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket.class)
public class ClientboundPlayerPositionPacket_380709017Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1298316072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298316072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1766221275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766221275L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__754750959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754750959L))
            info.setReturnValue("A\u927A8(\uFAC39|3X\uD65Fl2&z<+G7 k\uD06Bvwed>T+[X\u1573>\u4D28t>OJL\uCD54S\u1135V`\u324DPCJVx\u629D_i>^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_418971758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418971758L))
            info.setReturnValue(1790386605);
    }

    @Inject(at = @At("HEAD"), method = "of(ILnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;", cancellable = true)
    private static void of_673573268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673573268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_418971262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418971262L))
            info.setReturnValue(-758806365);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1058777929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1058777929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_578216550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(578216550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "change()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void change__1142456919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1142456919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives__1448326470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448326470L))
            info.setReturnValue(null);
    }


}
