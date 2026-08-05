package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.predicate.BlockStatePredicate.class)
public class BlockStatePredicate_1537857659Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1371468915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371468915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void test_1392568672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392568672L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "where(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/predicate/BlockStatePredicate;", cancellable = true)
    private void where__1214660368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214660368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/block/state/predicate/BlockStatePredicate;", cancellable = true)
    private static void forBlock_1826997247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826997247L))
            info.setReturnValue(null);
    }


}
