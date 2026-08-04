package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.MatchingBiomesPredicate.class)
public class MatchingBiomesPredicate2074130073Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_431650124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431650124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_2033803336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033803336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1019136425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019136425L))
            info.setReturnValue(null);
    }


}
