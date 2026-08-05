package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigVariant.ModelType.class)
public class ModelType_1262240086Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/pig/PigVariant$ModelType;", cancellable = true)
    private static void values_2110977797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110977797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/pig/PigVariant$ModelType;", cancellable = true)
    private static void valueOf_617362434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617362434L))
            info.setReturnValue(net.minecraft.world.entity.animal.pig.PigVariant.ModelType.COLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_126779614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126779614L))
            info.setReturnValue(";ld*f/骸C?Gחpi(,h'`&0WD}Up:E䛫)<||R");
    }


}
