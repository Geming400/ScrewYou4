package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Objective.Packed.class)
public class Packed1118595147Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1927862303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927862303L))
            info.setReturnValue("h?\u5F1Fs%^:\u7832oc>-(Jo`EEV8I(t\uA4F3gyjFQ+9<7=!I\u4AEA;t6^\uCDB0t\u0388o`s\u99F6\uCFDAp7am\u3043\u4984\u3EE0cWJ\"Ys\uC7ACUd|SSPo3%0`D$\u8A5Bf7!<B");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_209968879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209968879L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1889018672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889018672L))
            info.setReturnValue("_\uD172<'\uC84BZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1675947238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675947238L))
            info.setReturnValue(-898133615);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__1865947381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865947381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat__637116775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637116775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void criteria__1472305717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472305717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayAutoUpdate()Z", cancellable = true)
    private void displayAutoUpdate__800467832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800467832L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void renderType_339054714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339054714L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.INTEGER);
    }


}
