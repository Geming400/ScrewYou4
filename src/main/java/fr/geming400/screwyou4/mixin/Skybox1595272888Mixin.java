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
            info.setReturnValue(net.minecraft.world.level.dimension.DimensionType.Skybox.END);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_459812417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459812417L))
            info.setReturnValue("|@r8WTUTA\uC805(au0?J\u9830_J|\u02BFqm(DUHPQFQn|t[8^. ..i\"0fy%E\uC25AkO\u56C4e.\uBD58>B1=MC\u577B|Cov-\u9629RW93jC<Uqv)wB\uCBFDV=D|4\u0407F]");
    }


}
