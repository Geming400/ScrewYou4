package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.MultiVariantGenerator.class)
public class MultiVariantGenerator301938553Mixin {
        @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator$Empty;", cancellable = true)
    private static void dispatch_1613239511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613239511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private static void dispatch__1854520523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854520523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private void with_1309154445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309154445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private void with_332650904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332650904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelDispatcher;", cancellable = true)
    private void create_1914030738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914030738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block__455326546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455326546L))
            info.setReturnValue(null);
    }


}
