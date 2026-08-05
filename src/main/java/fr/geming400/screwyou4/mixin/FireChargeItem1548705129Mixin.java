package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.FireChargeItem.class)
public class FireChargeItem1548705129Mixin {
        @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__487548069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487548069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile_2036390287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036390287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__360138126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360138126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shoot(Lnet/minecraft/world/entity/projectile/Projectile;DDDFF)V", cancellable = true)
    private void shoot__1446070347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446070347L))
            info.cancel();
    }


}
