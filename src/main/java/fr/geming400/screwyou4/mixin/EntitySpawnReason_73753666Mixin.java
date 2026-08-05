package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntitySpawnReason.class)
public class EntitySpawnReason_73753666Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private static void values_747932191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747932191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private static void valueOf__700475940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700475940L))
            info.setReturnValue(net.minecraft.world.entity.EntitySpawnReason.MOB_SUMMONED);
    }

    @Inject(at = @At("HEAD"), method = "isSpawner(Lnet/minecraft/world/entity/EntitySpawnReason;)Z", cancellable = true)
    private static void isSpawner__30760354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30760354L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ignoresLightRequirements(Lnet/minecraft/world/entity/EntitySpawnReason;)Z", cancellable = true)
    private static void ignoresLightRequirements__30760354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30760354L))
            info.setReturnValue(false);
    }


}
