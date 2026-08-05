package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.FrequencyReductionMethod.class)
public class FrequencyReductionMethod432128628Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement$FrequencyReductionMethod;", cancellable = true)
    private static void values_1444282870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444282870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement$FrequencyReductionMethod;", cancellable = true)
    private static void valueOf_1416478195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416478195L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.FrequencyReductionMethod.LEGACY_TYPE_2);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__703331843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703331843L))
            info.setReturnValue("H\u7BDCX=btvm[\uCE87");
    }

    @Inject(at = @At("HEAD"), method = "shouldGenerate(JIIIF)Z", cancellable = true)
    private void shouldGenerate_1449186018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449186018L))
            info.setReturnValue(false);
    }


}
