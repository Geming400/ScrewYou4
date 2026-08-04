package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.TheEndBiomeSource.class)
public class TheEndBiomeSource_1667359261Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/biome/TheEndBiomeSource;", cancellable = true)
    private static void create_367461974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367461974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1248204264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248204264L))
            info.setReturnValue(null);
    }


}
