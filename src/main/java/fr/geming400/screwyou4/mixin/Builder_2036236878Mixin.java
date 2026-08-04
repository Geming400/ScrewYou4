package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.Builder.class)
public class Builder_2036236878Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private void build_1427856786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427856786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide_59081023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59081023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide_1281912364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281912364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide_535873523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535873523L))
            info.setReturnValue(null);
    }


}
