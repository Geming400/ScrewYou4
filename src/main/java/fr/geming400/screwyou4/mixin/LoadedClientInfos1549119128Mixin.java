package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ClientItemInfoLoader.LoadedClientInfos.class)
public class LoadedClientInfos1549119128Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1360335909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360335909L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_413659153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413659153L))
            info.setReturnValue("FE\u78B0Zp^|\u93F3YGzh{8`\uB238IQ:+fT2AS3\u8538#y?b^0ZMoJ\"Ein<\u48AFN?64g\u297BX\uD00D\u3183%3hBoB\uD273;%0M\"l\u0D0A`qG,\uB9EET\u3FF2}2N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1587381870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587381870L))
            info.setReturnValue(-1323792508);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/util/Map;", cancellable = true)
    private void contents__455504512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455504512L))
            info.setReturnValue(null);
    }


}
