package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.MobSpawnCost.class)
public class MobSpawnCost1971944472Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1063318204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063318204L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1552599299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552599299L))
            info.setReturnValue("H3n3; \uAC51\u08F8FR&r;P\u72DFetN'1RiYJ&sMDOmSdC\u976CEP\u6D50[85|2Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1765670733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765670733L))
            info.setReturnValue(-1438517181);
    }

    @Inject(at = @At("HEAD"), method = "energyBudget()D", cancellable = true)
    private void energyBudget_1026122604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026122604L))
            info.setReturnValue(3.701310001624744E8D);
    }

    @Inject(at = @At("HEAD"), method = "charge()D", cancellable = true)
    private void charge__1354257147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354257147L))
            info.setReturnValue(3.701310008050537E8D);
    }


}
