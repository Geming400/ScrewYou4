package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.Builder.class)
public class Builder_2036236878Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider;", cancellable = true)
    private void build_30936448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30936448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide_2019914662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019914662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide__1014484717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014484717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrueThenProvide(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/levelgen/feature/stateproviders/RuleBasedStateProvider$Builder;", cancellable = true)
    private void ifTrueThenProvide_791531372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791531372L))
            info.setReturnValue(null);
    }


}
