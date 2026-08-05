package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.predicate.BlockPredicate.class)
public class BlockPredicate148183510Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1588788201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588788201L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void test__1707824662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707824662L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/block/state/predicate/BlockPredicate;", cancellable = true)
    private static void forBlock_1692362034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692362034L))
            info.setReturnValue(null);
    }


}
