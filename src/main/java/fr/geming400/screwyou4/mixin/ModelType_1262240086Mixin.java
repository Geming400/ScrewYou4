package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigVariant.ModelType.class)
public class ModelType_1262240086Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/pig/PigVariant$ModelType;", cancellable = true)
    private static void values_1951993379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951993379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/pig/PigVariant$ModelType;", cancellable = true)
    private static void valueOf__905872086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905872086L))
            info.setReturnValue(net.minecraft.world.entity.animal.pig.PigVariant.ModelType.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1350448707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350448707L))
            info.setReturnValue("-t+O\u0282T*Cr\u5F8D:b_+;\u6839iE0\u2375vPZiho\"\u21A6Tu\uA26F\u3C2Dh_Rqj/\"I\uAF11v]");
    }


}
