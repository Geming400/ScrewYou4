package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.class)
public class SpecialWorldProperty1091716080Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private static void values_391832063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391832063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private static void valueOf__1976609192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976609192L))
            info.setReturnValue(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.NONE);
    }


}
