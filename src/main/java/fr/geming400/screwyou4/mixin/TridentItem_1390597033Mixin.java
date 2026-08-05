package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.TridentItem.class)
public class TridentItem_1390597033Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1800973067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800973067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_493416377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493416377L))
            info.setReturnValue(1125246236);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__443032302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443032302L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private static void createAttributes_901335028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901335028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties__1775727249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775727249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1950428566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950428566L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPEAR);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile_1878282190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878282190L))
            info.setReturnValue(null);
    }


}
