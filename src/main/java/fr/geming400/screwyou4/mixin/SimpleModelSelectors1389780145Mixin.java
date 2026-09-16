package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.SimpleModelSelectors.class)
public class SimpleModelSelectors1389780145Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_481153877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481153877L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2134763626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134763626L))
            info.setReturnValue(".EQmHk5<Z\uC082\u2160,D\uA71F\uCD13}\uAC5Ak\u7B79\uB6C5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1947132236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947132236L))
            info.setReturnValue(-788261040);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void instantiate_389997388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389997388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/Map;", cancellable = true)
    private void models__722119441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722119441L))
            info.setReturnValue(null);
    }


}
