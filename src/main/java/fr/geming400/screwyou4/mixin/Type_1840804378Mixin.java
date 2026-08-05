package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.TwoArgumentSimpleFunction.Type.class)
public class Type_1840804378Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/DensityFunctions$TwoArgumentSimpleFunction$Type;", cancellable = true)
    private static void values_289245027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289245027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/DensityFunctions$TwoArgumentSimpleFunction$Type;", cancellable = true)
    private static void valueOf__1828790944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828790944L))
            info.setReturnValue(net.minecraft.world.level.levelgen.DensityFunctions.TwoArgumentSimpleFunction.Type.MAX);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_705343906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705343906L))
            info.setReturnValue("-#ⳉ၎e8ᘿY8PaE-❞ml(E<t憻{]KᗒfKEO5EwKx>4i 6Q哼hQdsJ[/Jz}BW:俿U1*XBB");
    }


}
