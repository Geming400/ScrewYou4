package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.TrapezoidHeight.class)
public class TrapezoidHeight_2069223647Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1455320621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455320621L))
            info.setReturnValue("(['RN\u67C1;\u647ESf-%&M\u11C1b");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/TrapezoidHeight;", cancellable = true)
    private static void of_2053903047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053903047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;I)Lnet/minecraft/world/level/levelgen/heightproviders/TrapezoidHeight;", cancellable = true)
    private static void of_1061828384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061828384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_2104328581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104328581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample__544359355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-544359355L))
            info.setReturnValue(745734567);
    }


}
