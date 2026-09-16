package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.FireChargeItem.class)
public class FireChargeItem1548705129Mixin {
        @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__983219210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983219210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__533148918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533148918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_633587896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633587896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shoot(Lnet/minecraft/world/entity/projectile/Projectile;DDDFF)V", cancellable = true)
    private void shoot_1305783124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1305783124L))
            info.cancel();
    }


}
