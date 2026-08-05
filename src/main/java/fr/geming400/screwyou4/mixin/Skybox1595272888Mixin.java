package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.Skybox.class)
public class Skybox1595272888Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private static void values_1906519874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906519874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/dimension/DimensionType$Skybox;", cancellable = true)
    private static void valueOf_987345929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987345929L))
            info.setReturnValue(net.minecraft.world.level.dimension.DimensionType.Skybox.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1683481510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683481510L))
            info.setReturnValue("u>\u0242:+6I E1h&saHOg<PQ=5CvV}\u7DEB)3Vx6b]!");
    }


}
