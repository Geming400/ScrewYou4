package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket.class)
public class ClientboundCustomChatCompletionsPacket895240469Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1051108059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051108059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__13385799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13385799L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1665663994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665663994L))
            info.setReturnValue("'k\uB9B9<tz\u292C_!w\u8631\uB6E7xm?kE\u9EB4-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1452592560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452592560L))
            info.setReturnValue(-75253237);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1192154069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192154069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;", cancellable = true)
    private void action__238642361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238642361L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket.Action.REMOVE);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_599528606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599528606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__696237125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-696237125L))
            info.cancel();
    }


}
