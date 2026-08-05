package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnchantedItemTrigger.TriggerInstance.class)
public class TriggerInstance_168631820Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1554144078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554144078L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__966828156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966828156L))
            info.setReturnValue(">鷺[Bj'/K8e\"OK吠5Oai㤷풥u#yA4#:{Cb1qG8䧺t]J钱/}sj%魳A=k<<x,-Q$혁堕c2kU黔ci_aW汬n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_206894561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206894561L))
            info.setReturnValue(-1657809636);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches__1868069194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1868069194L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_414093241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414093241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void levels_17396761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17396761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_414093241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414093241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void enchantedItem_1442383218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442383218L))
            info.setReturnValue(null);
    }


}
