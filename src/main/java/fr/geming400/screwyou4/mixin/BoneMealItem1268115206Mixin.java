package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BoneMealItem.class)
public class BoneMealItem1268115206Mixin {
        @Inject(at = @At("HEAD"), method = "addGrowthParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void addGrowthParticles__892820477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892820477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "growWaterPlant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void growWaterPlant__1866196924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866196924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "growCrop(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void growCrop__570445636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570445636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_352997973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352997973L))
            info.setReturnValue(null);
    }


}
