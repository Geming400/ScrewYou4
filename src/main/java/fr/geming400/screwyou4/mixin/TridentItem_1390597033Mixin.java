package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.TridentItem.class)
public class TridentItem_1390597033Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1419503324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419503324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private static void createAttributes_102337057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102337057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__1172180657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172180657L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__1112492162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112492162L))
            info.setReturnValue(1526864013);
    }

    @Inject(at = @At("HEAD"), method = "asProjectile(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Position;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/entity/projectile/Projectile;", cancellable = true)
    private void asProjectile__691257015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691257015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_652782211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652782211L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.EAT);
    }

    @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties__1264299064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264299064L))
            info.setReturnValue(null);
    }


}
