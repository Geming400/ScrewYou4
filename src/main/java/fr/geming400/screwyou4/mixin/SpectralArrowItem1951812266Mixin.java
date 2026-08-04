package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SpectralArrowItem.class)
public class SpectralArrowItem1951812266Mixin {
        @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__1855469872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855469872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArrow(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;", cancellable = true)
    private void createArrow__1257377671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257377671L))
            info.setReturnValue(null);
    }


}
