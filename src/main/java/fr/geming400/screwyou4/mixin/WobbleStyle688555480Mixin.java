package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.WobbleStyle.class)
public class WobbleStyle688555480Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;", cancellable = true)
    private static void values__18663275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18663275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;", cancellable = true)
    private static void valueOf__529352292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529352292L))
            info.setReturnValue(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.WobbleStyle.NEGATIVE);
    }


}
