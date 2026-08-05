package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.UniformHeight.class)
public class UniformHeight1134260141Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1200330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200330L))
            info.setReturnValue("k{U2\u3DEDALz>\uB425%N\u2D56k6foX4d\u9BCFL\uC58Ba-)l^JIyf[IkG^8s&:\u8500");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/UniformHeight;", cancellable = true)
    private static void of_740310451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740310451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__1046331900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046331900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_1099406206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099406206L))
            info.setReturnValue(-373571457);
    }


}
