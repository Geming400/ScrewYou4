package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.EnderEyeItem.class)
public class EnderEyeItem_962865368Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1847234989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847234989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__1540223827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540223827L))
            info.setReturnValue(1592297934);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_47748134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47748134L))
            info.setReturnValue(null);
    }


}
