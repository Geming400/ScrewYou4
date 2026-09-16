package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.ItemPredicate.class)
public class ItemPredicate1223637990Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_315011722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315011722L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1994061515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994061515L))
            info.setReturnValue("mxMy5w;\u9411mR\u5F46ZYP\uBC17Wu'E99l|cTiME$0)I4+nFo./\uCC01jvJ\u3ED6Q .Vs1{=\uA70F#oa#0@h`\uD075/%)8'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1780990081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780990081L))
            info.setReturnValue(-810019933);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/ItemInstance;)Z", cancellable = true)
    private void test_1483535091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483535091L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__513333721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-513333721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void count__1667339451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667339451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_809719124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809719124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void components_1007993003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007993003L))
            info.setReturnValue(null);
    }


}
