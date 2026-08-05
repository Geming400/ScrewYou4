package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntitySpawnReason.class)
public class EntitySpawnReason_73753666Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private static void values__1560261187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560261187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private static void valueOf__2038790908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038790908L))
            info.setReturnValue(net.minecraft.world.entity.EntitySpawnReason.JOCKEY);
    }

    @Inject(at = @At("HEAD"), method = "ignoresLightRequirements(Lnet/minecraft/world/entity/EntitySpawnReason;)Z", cancellable = true)
    private static void ignoresLightRequirements__1610836903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610836903L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSpawner(Lnet/minecraft/world/entity/EntitySpawnReason;)Z", cancellable = true)
    private static void isSpawner_524070080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524070080L))
            info.setReturnValue(true);
    }


}
