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
            info.setReturnValue("-#\u2CC9\u104Ee8\u163FY8PaE-\u275Eml(E<t\u61BB{]K\u15D2fKEO5EwKx>4i 6Q\u54FChQdsJ[/Jz}BW:\u4FFFU1*XBB");
    }


}
