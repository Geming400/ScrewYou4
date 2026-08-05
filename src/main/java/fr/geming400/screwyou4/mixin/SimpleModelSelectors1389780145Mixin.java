package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.SimpleModelSelectors.class)
public class SimpleModelSelectors1389780145Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1519674892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519674892L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_254320170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254320170L))
            info.setReturnValue("锹ձ+-27Z\"됆<JzuX턚Wg&A>V딫B!ji思AB觴_$B)F㓃E$dzMgNX/+7$嬁i<WEcO㇢5s}/+]|䄪/bC2#}2p8Bt}BE∃hL0sq르");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1428042887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428042887L))
            info.setReturnValue(-689582378);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void instantiate_1234269794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234269794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/Map;", cancellable = true)
    private void models__614843495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614843495L))
            info.setReturnValue(null);
    }


}
