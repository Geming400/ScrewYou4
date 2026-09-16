package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.EnchantmentPredicate.class)
public class EnchantmentPredicate_1670247308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_761621039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761621039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1854296464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854296464L))
            info.setReturnValue("m\u9BE0(Tx;^Lhe\u53A0-&A6VeQfX1fMdX\u75E7}6(p2\u5024");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2067367898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067367898L))
            info.setReturnValue(1068716280);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level__1244652395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244652395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containedIn(Lnet/minecraft/world/item/enchantment/ItemEnchantments;)Z", cancellable = true)
    private void containedIn_1379069311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379069311L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Ljava/util/Optional;", cancellable = true)
    private void enchantments__1707480235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707480235L))
            info.setReturnValue(null);
    }


}
