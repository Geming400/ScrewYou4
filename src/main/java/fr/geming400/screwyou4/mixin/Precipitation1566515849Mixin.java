package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.Precipitation.class)
public class Precipitation1566515849Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private static void values_1249698938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249698938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private static void valueOf__1713750189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1713750189L))
            info.setReturnValue(net.minecraft.world.level.biome.Biome.Precipitation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1654724471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654724471L))
            info.setReturnValue(">r(vZm5SayA3/uipp1\uBB24@m0T3Ti=i:I?l\u74EF\u9B35PtUF/0wn<\u26B8^\u41B0:Ga\u2076]rM,qK-\u1ECF=Vc\u1702<<E$*j&Q_rYB{");
    }


}
