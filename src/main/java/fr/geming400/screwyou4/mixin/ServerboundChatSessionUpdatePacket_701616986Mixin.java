package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatSessionUpdatePacket.class)
public class ServerboundChatSessionUpdatePacket_701616986Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__977408103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977408103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2087129244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087129244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__433842990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433842990L))
            info.setReturnValue("o&C?\uC931pHvJNu1?Fc&He6'\"]._#\u926E6z\u292Fes\u1E8As'-EwP6)_E}]y\u2C52Nan\u973D\u28EEkvW<Zf`4QI>P%@t\u14ACa");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_739879727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739879727L))
            info.setReturnValue(-939400273);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1167005009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1167005009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1379685898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1379685898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chatSession()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void chatSession__1117200059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117200059L))
            info.setReturnValue(null);
    }


}
