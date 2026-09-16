package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.class)
public class BlockStateModelDispatcher_236403826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__672222443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672222443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1006827350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006827350L))
            info.setReturnValue("\u41E2[kYvPKRD\uC647nrn\u11FAI%42U\uC75Dw\u7A9D\u4CEEF$j`/pgVlep");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_793755916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793755916L))
            info.setReturnValue(-1779807044);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;Ljava/util/function/Supplier;)Ljava/util/Map;", cancellable = true)
    private void instantiate__1495027148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495027148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiPart()Ljava/util/Optional;", cancellable = true)
    private void multiPart__1282706709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282706709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simpleModels()Ljava/util/Optional;", cancellable = true)
    private void simpleModels_1119368411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119368411L))
            info.setReturnValue(null);
    }


}
