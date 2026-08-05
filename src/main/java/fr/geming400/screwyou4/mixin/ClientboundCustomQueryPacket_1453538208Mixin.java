package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundCustomQueryPacket.class)
public class ClientboundCustomQueryPacket_1453538208Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/login/custom/CustomQueryPayload;", cancellable = true)
    private void payload__533056704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533056704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__225486881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225486881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1455916830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455916830L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_318078232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318078232L))
            info.setReturnValue("D㸾p:Au6≗3U|k(z:MHjnaV&]&L:eNE>y]8$6騿칭䒎n_eG|-N;≲OR>왧c쟅틟#O=$>g䨕ja");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1491800949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491800949L))
            info.setReturnValue(1220754066);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2131607120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2131607120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle__782831281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-782831281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transactionId()I", cancellable = true)
    private void transactionId_1491800453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491800453L))
            info.setReturnValue(1497773274);
    }


}
