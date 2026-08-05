package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverInfo.class)
public class DiscoverInfo1188225440Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1721229597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721229597L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_52765465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52765465L))
            info.setReturnValue("c%.\u2502JLuA8\u08BB-HZ'wj\uAE59_?[|GR2\uC7D0q\u523FTxVQ");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version_52764969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52764969L))
            info.setReturnValue("\u27A3r}xd]}=h*!\u5860E><\uB87FV{3gt\u304Fu.bt}<%]oBJl*NGLR<(}d5!1WMIj3,7E?z`jK<V{kS:5d71.O!\uFD5F=E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1226488182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226488182L))
            info.setReturnValue(-677490904);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/lang/String;", cancellable = true)
    private void title_52764969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52764969L))
            info.setReturnValue("\u27A3r}xd]}=h*!\u5860E><\uB87FV{3gt\u304Fu.bt}<%]oBJl*NGLR<(}d5!1WMIj3,7E?z`jK<V{kS:5d71.O!\uFD5F=E");
    }


}
