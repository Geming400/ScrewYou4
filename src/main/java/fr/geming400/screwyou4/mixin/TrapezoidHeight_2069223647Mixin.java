package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.TrapezoidHeight.class)
public class TrapezoidHeight_2069223647Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_933763175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933763175L))
            info.setReturnValue("Hc[+5:_hUN} ?H㯺p}T^k58)$ꍡ?#?_^y8+0S`zᓚp]슀ÖL;7E};jIo풘Y對=s%8y}");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/TrapezoidHeight;", cancellable = true)
    private static void of_1796543792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796543792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/TrapezoidHeight;", cancellable = true)
    private static void of_1673626071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673626071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__111368395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111368395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_2034369711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034369711L))
            info.setReturnValue(-573539208);
    }


}
