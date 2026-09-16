package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.class)
public class PostChainConfig_494373051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__414253218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414253218L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1264796575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264796575L))
            info.setReturnValue("'g\u6333d6tcS6coM([\uB81AAZE+7gQo<8nb(e\u9FBCU{_|Vf\uC3E3%`\u0570Y#MB990\u5D0B:;+%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1051725141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051725141L))
            info.setReturnValue(1342566320);
    }

    @Inject(at = @At("HEAD"), method = "passes()Ljava/util/List;", cancellable = true)
    private void passes__1472400919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472400919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "internalTargets()Ljava/util/Map;", cancellable = true)
    private void internalTargets__720309251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720309251L))
            info.setReturnValue(null);
    }


}
