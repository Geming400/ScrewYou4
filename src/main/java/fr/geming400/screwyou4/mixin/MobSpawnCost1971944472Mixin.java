package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.MobSpawnCost.class)
public class MobSpawnCost1971944472Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__937510565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937510565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_836484497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836484497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2010207214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010207214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "energyBudget()D", cancellable = true)
    private void energyBudget_2010201913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010201913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "charge()D", cancellable = true)
    private void charge_2010201913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010201913L))
            info.setReturnValue(null);
    }


}
