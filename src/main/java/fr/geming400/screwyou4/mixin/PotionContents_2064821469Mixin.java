package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionContents.class)
public class PotionContents_2064821469Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_536194981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536194981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__844633569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844633569L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_929361493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929361493L))
            info.setReturnValue("ERE)n经65:4녹7 V#)C嘩SasU슨氲).q<)ǊQᲗ\"f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2103084210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103084210L))
            info.setReturnValue(403978608);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is__683666846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683666846L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_2103083714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103083714L))
            info.setReturnValue(582502098);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Lnet/minecraft/world/item/Item;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createItemStack__829558942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-829558942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__477896922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-477896922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withEffectAdded(Lnet/minecraft/world/effect/MobEffectInstance;)Lnet/minecraft/world/item/alchemy/PotionContents;", cancellable = true)
    private void withEffectAdded__1555263376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555263376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPotionTooltip(Ljava/lang/Iterable;Ljava/util/function/Consumer;FF)V", cancellable = true)
    private static void addPotionTooltip__2109215992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2109215992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "potion()Ljava/util/Optional;", cancellable = true)
    private void potion__1984684406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984684406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customName()Ljava/util/Optional;", cancellable = true)
    private void customName__1984684406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984684406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume__123421568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-123421568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColorOr(I)I", cancellable = true)
    private void getColorOr__1016241349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016241349L))
            info.setReturnValue(-736981607);
    }

    @Inject(at = @At("HEAD"), method = "hasEffects()Z", cancellable = true)
    private void hasEffects_2103100051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103100051L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withPotion(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/alchemy/PotionContents;", cancellable = true)
    private void withPotion_808899753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808899753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToLivingEntity(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void applyToLivingEntity__823887659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-823887659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllEffects()Ljava/lang/Iterable;", cancellable = true)
    private void getAllEffects_55071780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55071780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColorOptional(Ljava/lang/Iterable;)Ljava/util/OptionalInt;", cancellable = true)
    private static void getColorOptional__1103083694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103083694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customEffects()Ljava/util/List;", cancellable = true)
    private void customEffects__603809012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603809012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachEffect(Ljava/util/function/Consumer;F)V", cancellable = true)
    private void forEachEffect_1726123291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726123291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "customColor()Ljava/util/Optional;", cancellable = true)
    private void customColor__1984684406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984684406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPotionDescription(Lnet/minecraft/core/Holder;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void getPotionDescription_1902434025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902434025L))
            info.setReturnValue(null);
    }


}
