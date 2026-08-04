package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.DyeItem.class)
public class DyeItem_1897813099Mixin {
        @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity__1885072025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885072025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryApplyToSign(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void tryApplyToSign_1213519698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213519698L))
            info.setReturnValue(null);
    }


}
