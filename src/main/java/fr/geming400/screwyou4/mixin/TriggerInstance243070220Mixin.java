package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.FishingRodHookedTrigger.TriggerInstance.class)
public class TriggerInstance243070220Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1628582479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628582479L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__892389755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892389755L))
            info.setReturnValue("/%Ua]\"\u70A1d,?<y{\uBFE0f}BZ\"\uBB5A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_281332962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281332962L))
            info.setReturnValue(185951550);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/Collection;)Z", cancellable = true)
    private void matches_1717892600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717892600L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1896870508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1896870508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_488531642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488531642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_488531642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488531642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_488531642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488531642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rod()Ljava/util/Optional;", cancellable = true)
    private void rod_488531642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488531642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fishedItem(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void fishedItem__813697344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813697344L))
            info.setReturnValue(null);
    }


}
