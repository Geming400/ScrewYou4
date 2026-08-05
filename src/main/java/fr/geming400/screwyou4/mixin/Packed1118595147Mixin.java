package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Objective.Packed.class)
public class Packed1118595147Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__16865324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16865324L))
            info.setReturnValue("\u923AO am9M\uBB25wI+x\u71C6^sZr\"U;EdR(\u3D22I9I)5V8o\"p");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1790859890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790859890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__16864828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16864828L))
            info.setReturnValue("D2uq]PX*\u72CE/\uC6B5zH==I^!ZwVY 6!DZ\u3C3B\"\u2122c\u1889\u6C500\"d|k7g(V}[\u9CD1L&@m\uCD36Vp7?h\uD64D^XG\u48F9\u882BJ\u84E8sHmZUf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1156857889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156857889L))
            info.setReturnValue(-505844189);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__1058314018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058314018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat_1364056569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364056569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void criteria_1588014218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588014218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayAutoUpdate()Z", cancellable = true)
    private void displayAutoUpdate_1156873730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156873730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void renderType__500974966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500974966L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }


}
