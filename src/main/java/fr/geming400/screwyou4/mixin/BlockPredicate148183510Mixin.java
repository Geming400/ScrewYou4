package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.predicate.BlockPredicate.class)
public class BlockPredicate148183510Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1533824233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533824233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void test_2894524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2894524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/block/state/predicate/BlockPredicate;", cancellable = true)
    private static void forBlock__517716746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517716746L))
            info.setReturnValue(null);
    }


}
