package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData.class)
public class SpawnerData_1429338302Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void type_1096614063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096614063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_520712033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520712033L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2095205966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095205966L))
            info.setReturnValue("mhF7\uAB33'y>t$ /iLFkL\u4E04z{`f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1986690392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986690392L))
            info.setReturnValue(1142123125);
    }

    @Inject(at = @At("HEAD"), method = "maxCount()I", cancellable = true)
    private void maxCount__831200392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831200392L))
            info.setReturnValue(-270452353);
    }

    @Inject(at = @At("HEAD"), method = "minCount()I", cancellable = true)
    private void minCount_991105766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991105766L))
            info.setReturnValue(560827564);
    }


}
