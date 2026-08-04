package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.class)
public class BlocksAttacks724306407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2109818666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109818666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__411153568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411153568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_762569149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762569149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disable(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;FLnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void disable_1355781398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355781398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtBlockingItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;F)V", cancellable = true)
    private void hurtBlockingItem__1319739643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1319739643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveBlockedDamage(Lnet/minecraft/world/damagesource/DamageSource;FD)F", cancellable = true)
    private void resolveBlockedDamage_599972833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599972833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockDelayTicks()I", cancellable = true)
    private void blockDelayTicks_762568653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762568653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBlocked(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onBlocked__1246029671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1246029671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bypassedBy()Ljava/util/Optional;", cancellable = true)
    private void bypassedBy_969767829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969767829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageReductions()Ljava/util/List;", cancellable = true)
    private void damageReductions__1944324073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944324073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableSound()Ljava/util/Optional;", cancellable = true)
    private void disableSound_969767829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969767829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockDelaySeconds()F", cancellable = true)
    private void blockDelaySeconds_762565770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762565770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableCooldownScale()F", cancellable = true)
    private void disableCooldownScale_762565770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762565770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemDamage()Lnet/minecraft/world/item/component/BlocksAttacks$ItemDamageFunction;", cancellable = true)
    private void itemDamage_1453759733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453759733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockSound()Ljava/util/Optional;", cancellable = true)
    private void blockSound_969767829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969767829L))
            info.setReturnValue(null);
    }


}
