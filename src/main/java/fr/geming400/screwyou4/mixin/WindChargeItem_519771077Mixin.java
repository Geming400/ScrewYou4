package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.WindChargeItem.class)
public class WindChargeItem_519771077Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_930147111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930147111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile_1007456234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007456234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__1516482122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516482122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shoot(Lnet/minecraft/world/entity/projectile/Projectile;DDDFF)V", cancellable = true)
    private void shoot_1819962896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1819962896L))
            info.cancel();
    }


}
