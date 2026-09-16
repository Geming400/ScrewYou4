package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket.class)
public class ClientboundResourcePackPushPacket672571422Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_828439012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828439012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__236054846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236054846L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1442994947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442994947L))
            info.setReturnValue(";X>?!t_%3k\uCB80%5\u38D9NNSz\uF9CF5\uFE73O'$\uC5B1/,uL\"\uC5C0M\u7ACF_ (%<Dz:xY\uBA9A@m\u91578o\u3D10IW\u48DFN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1229923513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229923513L))
            info.setReturnValue(-1280393084);
    }

    @Inject(at = @At("HEAD"), method = "hash()Ljava/lang/String;", cancellable = true)
    private void hash_333005365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333005365L))
            info.setReturnValue("]uIBhhl[EjZ01\uA39E\u153E\u25C0EaA\u07C6oI\u1409\"rtqc<h'\u2DE6q$-\uAE00yh9bb\"@SN^\uF9DAac2e\u02750%']aK&\u2467%\u04D3]}O^gS^LK\uA445u\u2B24O8lzkO%c1FQ<.R");
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__736471082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736471082L))
            info.setReturnValue("M&\u8BA7Qtx*,pw+\uCF2937)8?UN1-<*UnEyZX`#j2p{PGN\u5610\uAED2V\u876F&\u5EF05\u0907tBQnS@_Xp0c3t>9zL\u3593I#873\u28AF@']]re3N-R&1y\u9108");
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1496415180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496415180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_376859559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(376859559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_422514980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(422514980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prompt()Ljava/util/Optional;", cancellable = true)
    private void prompt_1861517104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861517104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_1680012694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680012694L))
            info.setReturnValue(false);
    }


}
