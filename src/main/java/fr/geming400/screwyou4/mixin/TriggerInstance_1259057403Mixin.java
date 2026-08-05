package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.UsedEnderEyeTrigger.TriggerInstance.class)
public class TriggerInstance_1259057403Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1650397635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650397635L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_123597427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123597427L))
            info.setReturnValue(" )9^!a:\uC3F1Qgd@@\u3B8CTG\u4963^wF!ge\uFA86_GJozH>\u935Bra@B\uB082e4P.ixCa\u4D70w\",ItjZ2\u9481mO;\u9B26#q.!w}SY\u3B6B)\u37C4#0t\u65BD[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1297320144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297320144L))
            info.setReturnValue(-1903847385);
    }

    @Inject(at = @At("HEAD"), method = "matches(D)Z", cancellable = true)
    private void matches__1826606683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826606683L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "distance()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void distance_562590040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562590040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1504518824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504518824L))
            info.setReturnValue(null);
    }


}
