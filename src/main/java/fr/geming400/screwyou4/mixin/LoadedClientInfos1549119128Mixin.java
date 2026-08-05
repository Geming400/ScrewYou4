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
            info.setReturnValue("FE碰Zp^|鏳YGzh{8`눸IQ:+fT2AS3蔸#y?b^0ZMoJ\"Ein<䢯N?64g⥻X퀍ㆃ%3hBoB퉳;%0M\"lഊ`qG,맮T㿲}2N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1587381870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587381870L))
            info.setReturnValue(-1035214408);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/util/Map;", cancellable = true)
    private void contents__455504512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455504512L))
            info.setReturnValue(null);
    }


}
