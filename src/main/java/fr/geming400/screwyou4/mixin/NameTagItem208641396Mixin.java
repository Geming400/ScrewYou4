package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.NameTagItem.class)
public class NameTagItem208641396Mixin {
        @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity__835582225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835582225L))
            info.setReturnValue(null);
    }


}
