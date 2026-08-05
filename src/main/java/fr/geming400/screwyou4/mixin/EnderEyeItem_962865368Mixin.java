package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.EnderEyeItem.class)
public class EnderEyeItem_962865368Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1373241402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373241402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__945977888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945977888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_65684712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65684712L))
            info.setReturnValue(34042662);
    }


}
