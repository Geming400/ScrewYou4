package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BrushItem.class)
public class BrushItem126229535Mixin {
        @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_1918107637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918107637L))
            info.setReturnValue(-1693666676);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__788887698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788887698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick_599296298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599296298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__611585286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611585286L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPEAR);
    }


}
