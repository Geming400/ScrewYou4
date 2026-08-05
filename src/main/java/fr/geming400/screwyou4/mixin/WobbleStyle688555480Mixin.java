package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.WobbleStyle.class)
public class WobbleStyle688555480Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;", cancellable = true)
    private static void values_495132023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495132023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;", cancellable = true)
    private static void valueOf_979681396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979681396L))
            info.setReturnValue(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.WobbleStyle.NEGATIVE);
    }


}
