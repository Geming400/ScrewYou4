package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.InstrumentItem.class)
public class InstrumentItem1940980486Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void create_1467533192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467533192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__869119870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869119870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__562108708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562108708L))
            info.setReturnValue(-778771979);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1203165665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203165665L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.DRINK);
    }


}
