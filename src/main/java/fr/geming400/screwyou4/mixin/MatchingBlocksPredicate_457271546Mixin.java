package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.MatchingBlocksPredicate.class)
public class MatchingBlocksPredicate_457271546Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1185208404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185208404L))
            info.setReturnValue(null);
    }


}
