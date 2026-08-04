package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.BlockPredicateFilter.class)
public class BlockPredicateFilter117586618Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1249889213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249889213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPredicate(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;)Lnet/minecraft/world/level/levelgen/placement/BlockPredicateFilter;", cancellable = true)
    private static void forPredicate__237158077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237158077L))
            info.setReturnValue(null);
    }


}
