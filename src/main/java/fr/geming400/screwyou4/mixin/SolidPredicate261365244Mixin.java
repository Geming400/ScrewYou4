package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.SolidPredicate.class)
public class SolidPredicate261365244Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1381114705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381114705L))
            info.setReturnValue(null);
    }


}
