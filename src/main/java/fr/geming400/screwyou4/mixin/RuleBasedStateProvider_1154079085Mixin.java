package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.class)
public class RuleBasedStateProvider_1154079085Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private static void builder_612487026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612487026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private static void builder_364671542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364671542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_1518383385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518383385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private static void ifTrueThenProvide__1082137715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082137715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private static void ifTrueThenProvide_833035841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833035841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getOptionalState_1518383385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518383385L))
            info.setReturnValue(null);
    }


}
