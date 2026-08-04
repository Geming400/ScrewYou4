package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MobBucketItem.class)
public class MobBucketItem_673688465Mixin {
        @Inject(at = @At("HEAD"), method = "checkExtraContent(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkExtraContent__259423565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-259423565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidContext()Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private void getFluidContext__1925494581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925494581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyContents(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/BlockHitResult;)Z", cancellable = true)
    private void emptyContents__561356262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561356262L))
            info.setReturnValue(null);
    }


}
