package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.Cost.class)
public class Cost_283955092Mixin {
        @Inject(at = @At("HEAD"), method = "base()I", cancellable = true)
    private void base_322217337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322217337L))
            info.setReturnValue(-134282240);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669467350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669467350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851504884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851504884L))
            info.setReturnValue("d贮1$㣗AGH.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_322217833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322217833L))
            info.setReturnValue(-337429659);
    }

    @Inject(at = @At("HEAD"), method = "perLevelAboveFirst()I", cancellable = true)
    private void perLevelAboveFirst_322217337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322217337L))
            info.setReturnValue(-134282240);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)I", cancellable = true)
    private void calculate_1497859570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497859570L))
            info.setReturnValue(-1067033530);
    }


}
