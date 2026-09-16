package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DamagePredicate.class)
public class DamagePredicate_2111338070Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1202711801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202711801L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1413205702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413205702L))
            info.setReturnValue("\u659B\u9BEFS!rbW|5p\u055Btc#gqfKSql\uBF689{;LB[A'!F^l?NU6XU!C{Zvvg#)*g\u150B`?=\uD01C0\u5A7BQ-r7kcDw4\u14098Q;A\u9748sW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1626277136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626277136L))
            info.setReturnValue(-230295207);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches_2138151896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138151896L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "damage()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void damage_18122580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18122580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/core/component/predicates/DamagePredicate;", cancellable = true)
    private static void durability__1356640744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356640744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "durability()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void durability__1424122630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424122630L))
            info.setReturnValue(null);
    }


}
