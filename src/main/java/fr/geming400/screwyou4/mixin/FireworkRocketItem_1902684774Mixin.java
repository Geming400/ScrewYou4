package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.FireworkRocketItem.class)
public class FireworkRocketItem_1902684774Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1981906488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981906488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__6158482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6158482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__1904597365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904597365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenseConfig()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig;", cancellable = true)
    private void createDispenseConfig__133568425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133568425L))
            info.setReturnValue(null);
    }


}
