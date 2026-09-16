package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ProjectileItem.DispenseConfig.class)
public class DispenseConfig1193382129Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_284755861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284755861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1963805654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963805654L))
            info.setReturnValue("3kcxA|\u685B\u4318Z1zL=\u738CaA\u78509Kv93/1luik\u575B\u8729R:9@\u1A24]Av|U\uBDD5Vo&(+s=UDA\u9AD069W\u979F1m2(7kc#nCd;-5\uB50B7b\"}r_\u9D0CQ5lO\u4D37OQo*\u1074s9s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1750734220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750734220L))
            info.setReturnValue(555369101);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/item/ProjectileItem$DispenseConfig$Builder;", cancellable = true)
    private static void builder_806960831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806960831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "power()F", cancellable = true)
    private void power_1581297071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581297071L))
            info.setReturnValue(5.531336E8F);
    }

    @Inject(at = @At("HEAD"), method = "positionFunction()Lnet/minecraft/world/item/ProjectileItem$PositionFunction;", cancellable = true)
    private void positionFunction_380793058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380793058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideDispenseEvent()Ljava/util/OptionalInt;", cancellable = true)
    private void overrideDispenseEvent__1034643595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034643595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uncertainty()F", cancellable = true)
    private void uncertainty_503480358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503480358L))
            info.setReturnValue(5.541439E8F);
    }


}
