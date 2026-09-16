package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.PotionsPredicate.class)
public class PotionsPredicate_531730879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__376895390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376895390L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1302154403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302154403L))
            info.setReturnValue("<S:WGF!On=>!Uj='28!t}\u8A63]/R\u3858>\u146E\u5E70`<>jHN7\"\u7511980E|\uC842S\u6599iQ@&2[RuH\uFD17nY\u0E11-\u153E.{J(\u5652\uAD6EMGlq%C;6M\u2C60d\"\u20AF,_;yT$XTVE,l4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1089082969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089082969L))
            info.setReturnValue(-1807813366);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__2046721884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046721884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__936406466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936406466L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/alchemy/PotionContents;)Z", cancellable = true)
    private void matches_1446735097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446735097L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "potions(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/core/component/predicates/DataComponentPredicate;", cancellable = true)
    private static void potions__2147329402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147329402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potions()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void potions_2012065938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012065938L))
            info.setReturnValue(null);
    }


}
