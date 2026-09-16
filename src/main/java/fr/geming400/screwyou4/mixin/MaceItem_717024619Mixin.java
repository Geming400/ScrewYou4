package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MaceItem.class)
public class MaceItem_717024619Mixin {
        @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void hurtEnemy_152912041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(152912041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAttackDamageBonus(Lnet/minecraft/world/entity/Entity;FLnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private void getAttackDamageBonus__386899237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386899237L))
            info.setReturnValue(1.603669E8F);
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy__1116078743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1116078743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/item/component/ItemAttributeModifiers;", cancellable = true)
    private static void createAttributes__571235357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571235357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getItemDamageSource__676886733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676886733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties__1937871478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937871478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSmashAttack(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canSmashAttack__253772515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253772515L))
            info.setReturnValue(true);
    }


}
