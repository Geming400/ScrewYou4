package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BoneMealItem.class)
public class BoneMealItem1268115206Mixin {
        @Inject(at = @At("HEAD"), method = "growWaterPlant(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void growWaterPlant__927063061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927063061L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addGrowthParticles(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void addGrowthParticles_182342078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(182342078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "growCrop(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void growCrop_2126489439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126489439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__640728049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640728049L))
            info.setReturnValue(null);
    }


}
