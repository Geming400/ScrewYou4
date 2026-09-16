package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDisguisedChatPacket.class)
public class ClientboundDisguisedChatPacket807393636Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_963261226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963261226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__101232632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101232632L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1577817161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577817161L))
            info.setReturnValue("W|}slV@QgmNc\"p\uD510Oa0w\u5AC3iLNyGe\u859DxtX\u2504\u38F1%u!yXcm\u66088}\u8F90:Y}y{\u6E36;H9`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364745727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364745727L))
            info.setReturnValue(-457395363);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__699145922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699145922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__784083958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-784083958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_511681773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(511681773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void chatType_819071912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819071912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_471923226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471923226L))
            info.setReturnValue(false);
    }


}
