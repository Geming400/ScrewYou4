package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BrushItem.class)
public class BrushItem126229535Mixin {
        @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick__562956091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562956091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__770951120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770951120L))
            info.setReturnValue(352542446);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1782613720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782613720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_686061069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686061069L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.TRIDENT);
    }


}
