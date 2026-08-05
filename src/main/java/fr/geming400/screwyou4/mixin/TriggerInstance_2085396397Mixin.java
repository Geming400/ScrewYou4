package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.InventoryChangeTrigger.TriggerInstance.class)
public class TriggerInstance_2085396397Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__824058641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824058641L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_949936421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949936421L))
            info.setReturnValue("tg}HLdU9edj\"bt\u1B7ET.7Pc\u11A9$r\uABBC+,G4(D|j0\uFEED[.VU$vwc_tiV\uC740R}_!TQ/m\u2DF4*6l5)(^{i\u8124 Q\u5518M(0m ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2123659138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123659138L))
            info.setReturnValue(2137295758);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/item/ItemStack;III)Z", cancellable = true)
    private void matches__1469883703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469883703L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/advancements/triggers/InventoryChangeTrigger$TriggerInstance$Slots;", cancellable = true)
    private void slots__789603448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789603448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items__583234084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583234084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1964109478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964109478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/advancements/predicates/ItemPredicate;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems_1693718982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693718982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems__680055609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680055609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasItems([Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void hasItems__305706609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305706609L))
            info.setReturnValue(null);
    }


}
