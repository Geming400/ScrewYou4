package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundCustomQueryAnswerPacket.class)
public class ServerboundCustomQueryAnswerPacket_341398026Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/login/custom/CustomQueryAnswerPayload;", cancellable = true)
    private void payload_1878448022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878448022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_497265615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497265615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__567228243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567228243L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1111821550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111821550L))
            info.setReturnValue("79y\u5E89!=9Ob\uFEC8n\u0D7ErO\u6600%1\u3ED1,\u0F14Lbu??");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_898750116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898750116L))
            info.setReturnValue(105268986);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle_1546700297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1546700297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_45686162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(45686162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transactionId()I", cancellable = true)
    private void transactionId_1331725046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331725046L))
            info.setReturnValue(-44071526);
    }


}
