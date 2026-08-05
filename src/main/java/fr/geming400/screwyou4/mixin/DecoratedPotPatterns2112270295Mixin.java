package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotPatterns.class)
public class DecoratedPotPatterns2112270295Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/level/block/entity/DecoratedPotPattern;", cancellable = true)
    private static void bootstrap_1132957709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132957709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemToPatternMappings(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void itemToPatternMappings_281769900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(281769900L))
            info.cancel();
    }


}
