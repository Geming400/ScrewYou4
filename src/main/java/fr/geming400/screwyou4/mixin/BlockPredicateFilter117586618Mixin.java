package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.BlockPredicateFilter.class)
public class BlockPredicateFilter117586618Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_779229565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779229565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forPredicate(Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;)Lnet/minecraft/world/level/levelgen/placement/BlockPredicateFilter;", cancellable = true)
    private static void forPredicate__551838031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551838031L))
            info.setReturnValue(null);
    }


}
