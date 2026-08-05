package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.MultiPartGenerator.class)
public class MultiPartGenerator_1068326695Mixin {
        @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with_657725524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657725524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with__301038490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301038490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private void with_1651061985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651061985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelDispatcher;", cancellable = true)
    private void create__1845618373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845618373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block_1903571374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903571374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiPart(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;", cancellable = true)
    private static void multiPart_1585098143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585098143L))
            info.setReturnValue(null);
    }


}
