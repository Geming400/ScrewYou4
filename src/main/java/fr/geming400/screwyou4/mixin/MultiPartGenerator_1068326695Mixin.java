package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.MultiPartGenerator.class)
public class MultiPartGenerator_1068326695Mixin {
        @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with_826297998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826297998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with__552909792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552909792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with_1604919143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604919143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelDispatcher;", cancellable = true)
    private void create__1614548417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614548417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block_311061595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311061595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiPart(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private static void multiPart_1617602259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617602259L))
            info.setReturnValue(null);
    }


}
