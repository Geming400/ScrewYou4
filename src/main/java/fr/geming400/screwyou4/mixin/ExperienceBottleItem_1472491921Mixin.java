package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ExperienceBottleItem.class)
public class ExperienceBottleItem_1472491921Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1882867955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882867955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile_1960177078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960177078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__563761278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563761278L))
            info.setReturnValue(null);
    }


}
