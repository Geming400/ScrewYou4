package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MaceItem.class)
public class MaceItem_717024619Mixin {
        @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void hurtEnemy_1039238402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039238402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAttackDamageBonus(Lnet/minecraft/world/entity/Entity;FLnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private void getAttackDamageBonus__1918741751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918741751L))
            info.setReturnValue(1.560753E8F);
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy_1039238402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039238402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private static void createAttributes_227762614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227762614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSmashAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canSmashAttack_1038692041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038692041L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties_1845667633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845667633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getItemDamageSource_2029446944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029446944L))
            info.setReturnValue(null);
    }


}
