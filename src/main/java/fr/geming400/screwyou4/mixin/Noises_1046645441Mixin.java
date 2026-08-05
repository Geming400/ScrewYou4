package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Noises.class)
public class Noises_1046645441Mixin {
        @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/levelgen/PositionalRandomFactory;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private static void instantiate_1553609210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553609210L))
            info.setReturnValue(null);
    }


}
