package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.Skybox.class)
public class Skybox1595272888Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private static void values_1088809124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088809124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private static void valueOf_2048147681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048147681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_459812417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459812417L))
            info.setReturnValue(null);
    }


}
