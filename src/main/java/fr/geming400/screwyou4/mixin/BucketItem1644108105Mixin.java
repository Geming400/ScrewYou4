package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BucketItem.class)
public class BucketItem1644108105Mixin {
        @Inject(at = @At("HEAD"), method = "getContent()Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private void getContent__720241828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720241828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1165992251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165992251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidContext()Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private void getFluidContext_1001187561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001187561L))
            info.setReturnValue(net.minecraft.world.level.ClipContext.Fluid.SOURCE_ONLY);
    }

    @Inject(at = @At("HEAD"), method = "getEmptySuccessItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void getEmptySuccessItem__2107714460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107714460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyContents(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/BlockHitResult;)Z", cancellable = true)
    private void emptyContents_1372742316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372742316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkExtraContent(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkExtraContent_1802654173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802654173L))
            info.cancel();
    }


}
