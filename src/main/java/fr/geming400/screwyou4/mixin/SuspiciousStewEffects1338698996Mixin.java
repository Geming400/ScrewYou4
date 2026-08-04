package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SuspiciousStewEffects.class)
public class SuspiciousStewEffects1338698996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1570756041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570756041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_203239021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203239021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1376961738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376961738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects__1329931484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329931484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume__849544040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-849544040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1204019394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1204019394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withEffectAdded(Lnet/minecraft/world/item/component/SuspiciousStewEffects$Entry;)Lnet/minecraft/world/item/component/SuspiciousStewEffects;", cancellable = true)
    private void withEffectAdded__473540575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473540575L))
            info.setReturnValue(null);
    }


}
