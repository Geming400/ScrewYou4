package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.MatchingFluidsPredicate.class)
public class MatchingFluidsPredicate136845507Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1505634442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505634442L))
            info.setReturnValue(null);
    }


}
