package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.WindChargeItem.class)
public class WindChargeItem_519771077Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_2004638016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004638016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__2012153263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012153263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__1562082971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1562082971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shoot(Lnet/minecraft/world/entity/projectile/Projectile;DDDFF)V", cancellable = true)
    private void shoot_276849071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(276849071L))
            info.cancel();
    }


}
