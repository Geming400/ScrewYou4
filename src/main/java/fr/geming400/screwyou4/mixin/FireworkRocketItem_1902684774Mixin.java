package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.FireworkRocketItem.class)
public class FireworkRocketItem_1902684774Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__907415583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907415583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__629239566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629239566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__179169274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179169274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_987567540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987567540L))
            info.setReturnValue(null);
    }


}
