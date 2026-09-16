package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundResourcePackPopPacket.class)
public class ClientboundResourcePackPopPacket_953386241Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1109253830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109253830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_44759972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44759972L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1723809765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723809765L))
            info.setReturnValue("=tw8l\u7FFF\uD487-UH\u06BCQ_]Is\u81F9:a(_cA\uC795\uFE58r#KWl_*b}\uB4F9Y|-c'T4U\u2036yB[*M\u2F432\u7A3F4\u8EAD_'L[\u7264Wb['{\u9A76&5\u557A_$K\u17A9(7=WY\"\u88C8\uA5E1Zy+'6hT7R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1510738331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510738331L))
            info.setReturnValue(1701952069);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id__1401543991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401543991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_657674377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(657674377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_703329798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(703329798L))
            info.cancel();
    }


}
