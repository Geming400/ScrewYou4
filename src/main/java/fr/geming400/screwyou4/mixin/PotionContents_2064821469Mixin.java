package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionContents.class)
public class PotionContents_2064821469Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_608154406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608154406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1156195200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156195200L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1459722303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459722303L))
            info.setReturnValue("\u9F35q@x\u7E4FZ@\u839F}!0H&P\u08FFk_*:\">qa\u6F5CZ%B}Y\u727AM7qHnGW?K]E\u1B71!_\u24C0S>'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1672793737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672793737L))
            info.setReturnValue(669685071);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is_1899034508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899034508L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor__1291243211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291243211L))
            info.setReturnValue(-244666347);
    }

    @Inject(at = @At("HEAD"), method = "potion()Ljava/util/Optional;", cancellable = true)
    private void potion__103375075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103375075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__310398579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-310398579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withEffectAdded(Lnet/minecraft/world/effect/MobEffectInstance;)Lnet/minecraft/world/item/alchemy/PotionContents;", cancellable = true)
    private void withEffectAdded_353788551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353788551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPotionTooltip(Ljava/lang/Iterable;Ljava/util/function/Consumer;FF)V", cancellable = true)
    private static void addPotionTooltip__1669170729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1669170729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createItemStack__846518597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846518597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume_1972724317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972724317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "customColor()Ljava/util/Optional;", cancellable = true)
    private void customColor__356476164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356476164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllEffects()Ljava/lang/Iterable;", cancellable = true)
    private void getAllEffects_901949243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901949243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPotionDescription(Lnet/minecraft/core/Holder;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void getPotionDescription_734693910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734693910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customEffects()Ljava/util/List;", cancellable = true)
    private void customEffects_2142977245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142977245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColorOptional(Ljava/lang/Iterable;)Ljava/util/OptionalInt;", cancellable = true)
    private static void getColorOptional_544879493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544879493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachEffect(Ljava/util/function/Consumer;F)V", cancellable = true)
    private void forEachEffect__2033800544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2033800544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyToLivingEntity(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void applyToLivingEntity_1712633632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712633632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColorOr(I)I", cancellable = true)
    private void getColorOr_1934587819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934587819L))
            info.setReturnValue(3312324);
    }

    @Inject(at = @At("HEAD"), method = "hasEffects()Z", cancellable = true)
    private void hasEffects__615814517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615814517L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withPotion(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/alchemy/PotionContents;", cancellable = true)
    private void withPotion__1006816094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006816094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customName()Ljava/util/Optional;", cancellable = true)
    private void customName_1100899366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100899366L))
            info.setReturnValue(null);
    }


}
