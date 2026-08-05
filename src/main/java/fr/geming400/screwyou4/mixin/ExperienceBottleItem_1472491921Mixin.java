package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ExperienceBottleItem.class)
public class ExperienceBottleItem_1472491921Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1337608436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337608436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__1059432419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059432419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__609362127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609362127L))
            info.setReturnValue(null);
    }


}
