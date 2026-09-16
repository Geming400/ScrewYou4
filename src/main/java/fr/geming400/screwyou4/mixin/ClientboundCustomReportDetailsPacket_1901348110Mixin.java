package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundCustomReportDetailsPacket.class)
public class ClientboundCustomReportDetailsPacket_1901348110Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2057215699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057215699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_992721841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992721841L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1623195662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623195662L))
            info.setReturnValue("-Bmv\u6CC8\u65A92+7^\uB35E5r?6{\uAD6C# #$F(\u1BB2ST*\uBFEBEm}Am}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1836267096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836267096L))
            info.setReturnValue(-1508433813);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1605636246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1605636246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_1651291667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1651291667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "details()Ljava/util/Map;", cancellable = true)
    private void details__1302382989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302382989L))
            info.setReturnValue(null);
    }


}
