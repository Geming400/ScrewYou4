package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.class)
public class RuleBasedStateProvider_1154079085Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private static void builder_1535796685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535796685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private static void builder__1629555375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629555375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_174721054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174721054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private static void ifTrueThenProvide__1188025100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188025100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private static void ifTrueThenProvide_1645981370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645981370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalState(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getOptionalState_886481310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886481310L))
            info.setReturnValue(null);
    }


}
