package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData.class)
public class SpawnerData_1429338302Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void type__823717847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823717847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1480116736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480116736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_293877830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293877830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1467601043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467601043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxCount()I", cancellable = true)
    private void maxCount_1467600547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467600547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minCount()I", cancellable = true)
    private void minCount_1467600547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467600547L))
            info.setReturnValue(null);
    }


}
