package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.ConstantHeight.class)
public class ConstantHeight1013586551Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__121873920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121873920L))
            info.setReturnValue("8 rODq>,(");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/ConstantHeight;", cancellable = true)
    private static void of__43436526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43436526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Lnet/minecraft/world/level/levelgen/VerticalAnchor;", cancellable = true)
    private void getValue_1224544681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224544681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType__1167005490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167005490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample_978732616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978732616L))
            info.setReturnValue(984844863);
    }


}
