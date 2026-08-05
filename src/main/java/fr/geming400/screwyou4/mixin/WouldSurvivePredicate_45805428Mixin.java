package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.WouldSurvivePredicate.class)
public class WouldSurvivePredicate_45805428Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_511116972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511116972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1247114401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247114401L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1320296656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320296656L))
            info.setReturnValue(false);
    }


}
