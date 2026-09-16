package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.FrequencyReductionMethod.class)
public class FrequencyReductionMethod432128628Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement$FrequencyReductionMethod;", cancellable = true)
    private static void values__1388436716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388436716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement$FrequencyReductionMethod;", cancellable = true)
    private static void valueOf__2048082149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048082149L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.FrequencyReductionMethod.LEGACY_TYPE_3);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_520337250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520337250L))
            info.setReturnValue("&,UV\u6219>0T\uB6E0\u42CCTr?}`a$4_i<>_+T.M<ULh{b\uD028\"\u352F2k6QM#d+;G@t@;OVT>m\u6B9D2*N6{\u9307\uA0F3Zwxx+Z ");
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerate(JIIIF)Z", cancellable = true)
    private void shouldGenerate__1160886998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160886998L))
            info.setReturnValue(false);
    }


}
