package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.MatchingBlockTagPredicate.class)
public class MatchingBlockTagPredicate_1314320033Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__328159917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328159917L))
            info.setReturnValue(null);
    }


}
