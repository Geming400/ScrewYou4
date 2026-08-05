package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MobBucketItem.class)
public class MobBucketItem_673688465Mixin {
        @Inject(at = @At("HEAD"), method = "getFluidContext()Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private void getFluidContext_30767920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(30767920L))
            info.setReturnValue(net.minecraft.world.level.ClipContext.Fluid.NONE);
    }

    @Inject(at = @At("HEAD"), method = "emptyContents(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/BlockHitResult;)Z", cancellable = true)
    private void emptyContents_402322675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402322675L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkExtraContent(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkExtraContent_832234532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832234532L))
            info.cancel();
    }


}
