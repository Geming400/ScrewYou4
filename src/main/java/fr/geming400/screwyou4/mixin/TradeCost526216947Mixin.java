package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeCost.class)
public class TradeCost526216947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1911729206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911729206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__609243028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609243028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_564479689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564479689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void count__1137440699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137440699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_2102847638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2102847638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_2075092719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075092719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void components__1058492796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058492796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toItemCost(Lnet/minecraft/world/level/storage/loot/LootContext;I)Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void toItemCost__579463944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579463944L))
            info.setReturnValue(null);
    }


}
