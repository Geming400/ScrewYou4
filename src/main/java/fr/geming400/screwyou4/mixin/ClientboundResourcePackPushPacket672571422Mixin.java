package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket.class)
public class ClientboundResourcePackPushPacket672571422Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1006453666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006453666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2058083681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058083681L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__462888553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462888553L))
            info.setReturnValue("}xH\u163DCbO_9@eZ#\uC970'\uFFCFv\uACBCbDA\u84A2\u4EDFzZoOch\"K^(<\u04AA2UX\uB79BA(\u82D7N(>)l\u87AF\uB468#1Yco\u0316QspQ.<|B9L{VJC!N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_710834164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710834164L))
            info.setReturnValue(-1236348945);
    }

    @Inject(at = @At("HEAD"), method = "hash()Ljava/lang/String;", cancellable = true)
    private void hash__462889049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462889049L))
            info.setReturnValue("*f$iu^-\u286F\",");
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__462889049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462889049L))
            info.setReturnValue("*f$iu^-\u286F\",");
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1083705905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083705905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1350640335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1350640335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__787678132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-787678132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prompt()Ljava/util/Optional;", cancellable = true)
    private void prompt_918032844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918032844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_710850005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710850005L))
            info.setReturnValue(false);
    }


}
