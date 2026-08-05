package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketFlow.class)
public class PacketFlow1636071104Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private static void values__1648387891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648387891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private static void valueOf_1783561958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783561958L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1977232676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977232676L))
            info.setReturnValue("vUX19\u9901X-(5\u5FC8j\uCEF75u(\uB11D2zuFb");
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getOpposite__82622833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82622833L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }


}
