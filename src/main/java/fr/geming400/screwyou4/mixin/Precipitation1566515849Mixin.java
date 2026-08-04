package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.Precipitation.class)
public class Precipitation1566515849Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private static void values_488658392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488658392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private static void valueOf__1421800581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421800581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_431055378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431055378L))
            info.setReturnValue(null);
    }


}
