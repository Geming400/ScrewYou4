package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsingItemTrigger.TriggerInstance.class)
public class TriggerInstance1777407144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1132047893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132047893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_641947169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641947169L))
            info.setReturnValue(":cqC}@kIG5R/dBR5Z#\u568C@NvXOkcn{$fw\u7215I[`Z}$Zp=k)_\uA2A9\u72F3*|&\"O-\u6146$2!tC-GB9%WC<I\u6DB5rAJ($%By\u2CA1%(hA\u0E3AI]\uBD8A\u1F65i\u1106o3As%dy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1815669886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815669886L))
            info.setReturnValue(936461673);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__783025020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783025020L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_2022868566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022868566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookingAt(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lookingAt__176882703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176882703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_2022868566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022868566L))
            info.setReturnValue(null);
    }


}
