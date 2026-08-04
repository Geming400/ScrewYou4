package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.TrueBlockPredicate.class)
public class TrueBlockPredicate_1485554424Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__156925526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156925526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1445227686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445227686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1607712075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607712075L))
            info.setReturnValue(null);
    }


}
