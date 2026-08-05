package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.MultiVariantGenerator.class)
public class MultiVariantGenerator301938553Mixin {
        @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator$Empty;", cancellable = true)
    private static void dispatch__1282770787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282770787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatch(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private static void dispatch__802793937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802793937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private void with_802445191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802445191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private void with__1283637742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283637742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelDispatcher;", cancellable = true)
    private void create_1682960782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682960782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block_1137183233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137183233L))
            info.setReturnValue(null);
    }


}
