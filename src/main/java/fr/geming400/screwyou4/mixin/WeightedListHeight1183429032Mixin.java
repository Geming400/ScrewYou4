package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.WeightedListHeight.class)
public class WeightedListHeight1183429032Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_1218533967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218533967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample__1430153969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430153969L))
            info.setReturnValue(-876073712);
    }


}
