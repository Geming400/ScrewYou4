package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BucketItem.class)
public class BucketItem1644108105Mixin {
        @Inject(at = @At("HEAD"), method = "getContent()Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private void getContent__170293159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170293159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_2054484140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054484140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEmptySuccessItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void getEmptySuccessItem__177439739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177439739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkExtraContent(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkExtraContent_710996076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(710996076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidContext()Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private void getFluidContext__955074940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955074940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyContents(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/BlockHitResult;)Z", cancellable = true)
    private void emptyContents_409063379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409063379L))
            info.setReturnValue(null);
    }


}
