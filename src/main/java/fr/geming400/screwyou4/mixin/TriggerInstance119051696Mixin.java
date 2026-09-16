package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ConsumeItemTrigger.TriggerInstance.class)
public class TriggerInstance119051696Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__789574572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789574572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_889475221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889475221L))
            info.setReturnValue("d1.a!\u3800}l\u6880\"/\u23C0 vjE*ThATd(FDY\uB1AD$[nye4M_C!\"\u406AZ)C\u8B1FbS5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_676403787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676403787L))
            info.setReturnValue(-1979671414);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches_1488234937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488234937L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item__679462543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679462543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1111601345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111601345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem(Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem_204446958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204446958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem_1814024871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814024871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedItem(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void usedItem_20814964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20814964L))
            info.setReturnValue(null);
    }


}
