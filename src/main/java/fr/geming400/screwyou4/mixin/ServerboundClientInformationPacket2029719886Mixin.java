package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundClientInformationPacket.class)
public class ServerboundClientInformationPacket2029719886Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_350694798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350694798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__879735151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879735151L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_894259911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894259911L))
            info.setReturnValue("TM)meHJ5*[>}c2BpUm[-쏶+yzܾ=텈79&a츤[1RNq\"\"䂣}N鼈JkqFVrYﵝo3XGVZQ@VH\"촁WT쬳/=,<1ꙹQ`H/Ab1䛫瑾y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2067982628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067982628L))
            info.setReturnValue(444162040);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__706115324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-706115324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1587178497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587178497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "information()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void information_1097830206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097830206L))
            info.setReturnValue(null);
    }


}
