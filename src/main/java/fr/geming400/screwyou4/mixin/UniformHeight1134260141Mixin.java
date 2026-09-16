package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.heightproviders.UniformHeight.class)
public class UniformHeight1134260141Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1904683170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904683170L))
            info.setReturnValue("\u8C1FuX+EGd\uAD9AmilW4lPQGV3VL\uA6D1HC\u4351@z=\u8D15-^]p\u37E39 #oY\uBC76TDL#7`I#\u4CFA\u8B5C\u4E56ISLH1hz3E,dp9r.cyG!nk_-F");
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/VerticalAnchor;Lnet/minecraft/world/level/levelgen/VerticalAnchor;)Lnet/minecraft/world/level/levelgen/heightproviders/UniformHeight;", cancellable = true)
    private static void of__1284000502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284000502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/heightproviders/HeightProviderType;", cancellable = true)
    private void getType_1169365076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169365076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void sample__1479322860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479322860L))
            info.setReturnValue(-1082514718);
    }


}
