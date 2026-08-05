package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketFlow.class)
public class PacketFlow1636071104Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private static void values__1188984917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188984917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private static void valueOf_676814094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676814094L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_500610633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500610633L))
            info.setReturnValue("Tj-HiK]=+쐷+GtBWXp4hVq4lK90M'UMz`$ŵvV0oG&E[Qh\"]-+kBJF鍷 H BvM fj鋹gou\"plT9=");
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getOpposite_44330124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44330124L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }


}
