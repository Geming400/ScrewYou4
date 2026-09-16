package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeCost.class)
public class TradeCost526216947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__382409321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382409321L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1296640472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296640472L))
            info.setReturnValue("annWO_WmMW+=.\u07566$O=\u25DE{`rD;\u2594\"Z0=go_4ZU].\u9AF1-?=;._LiWGBRac6`Z-Fk2Z@4J<\u853C>N\uCE35dbif'tx1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1083569038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083569038L))
            info.setReturnValue(-1230452808);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void count_695943892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695943892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__492501824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-492501824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__6076036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6076036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void components__1438691558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438691558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toItemCost(Lnet/minecraft/world/level/storage/loot/LootContext;I)Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void toItemCost_264646803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264646803L))
            info.setReturnValue(null);
    }


}
