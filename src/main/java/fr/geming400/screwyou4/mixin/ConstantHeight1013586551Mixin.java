package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.ConstantHeight.class)
public class ConstantHeight1013586551Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1784009580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784009580L))
            info.setReturnValue("=Z\uBEFD'k\u4E74A\u8A6F&");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/ConstantHeight;", cancellable = true)
    private static void of_1981399337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981399337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Lnet/minecraft/world/level/levelgen/VerticalAnchor;", cancellable = true)
    private void getValue__1225817202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225817202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_1048691486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048691486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample__1599996450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599996450L))
            info.setReturnValue(479029351);
    }


}
