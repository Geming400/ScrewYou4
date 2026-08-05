package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.ItemCost.class)
public class ItemCost1690312022Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1219143015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219143015L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_554852047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554852047L))
            info.setReturnValue("3HLcF}g\u06EB)UT/7H(B25\u2FAD+@s %\u74F9A\u39DD5z;*kzoy3/vB`pMk\uFC12?`\u268B1%dL\u4368IQ\u0806O\u1730TAV@\u1E11u`)D\u6A5Ag!u!\u2A194;x\u3471DwG*C\u7E8D50I*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1728574764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728574764L))
            info.setReturnValue(-499148933);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void test__870120142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870120142L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1728574268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728574268L))
            info.setReturnValue(-296001514);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__1055779502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055779502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void components_105602279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105602279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withComponents(Ljava/util/function/UnaryOperator;)Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void withComponents__930168076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930168076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack__2081236614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081236614L))
            info.setReturnValue(null);
    }


}
