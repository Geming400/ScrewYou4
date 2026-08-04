package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.WeightedListHeight.class)
public class WeightedListHeight1183429032Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__997163009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997163009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_1148575097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148575097L))
            info.setReturnValue(null);
    }


}
