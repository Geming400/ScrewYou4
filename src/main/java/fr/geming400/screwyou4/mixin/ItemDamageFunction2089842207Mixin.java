package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.ItemDamageFunction.class)
public class ItemDamageFunction2089842207Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base_2128101570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128101570L))
            info.setReturnValue(5.259478E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__819612830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819612830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_954382232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954382232L))
            info.setReturnValue("/Kql;\u2630&E!#w\uB816Z<6&;k?\u596E;vH\u5C1DFf\u10DF\u2C6B}c^ew_FlZrI\uAA2B\uCF6D\u61476!ZC)IC\uA71BK\uB8A8NV:GNit.`V?1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2128104949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128104949L))
            info.setReturnValue(-419308465);
    }

    @Inject(at = @At("HEAD"), method = "apply(F)I", cancellable = true)
    private void apply__993991173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993991173L))
            info.setReturnValue(771188182);
    }

    @Inject(at = @At("HEAD"), method = "threshold()F", cancellable = true)
    private void threshold_2128101570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128101570L))
            info.setReturnValue(5.259478E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_2128101570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128101570L))
            info.setReturnValue(5.259478E8F);
    }


}
