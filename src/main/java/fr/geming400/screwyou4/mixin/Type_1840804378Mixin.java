package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.TwoArgumentSimpleFunction.Type.class)
public class Type_1840804378Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/DensityFunctions$TwoArgumentSimpleFunction$Type;", cancellable = true)
    private static void values_710386817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710386817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/DensityFunctions$TwoArgumentSimpleFunction$Type;", cancellable = true)
    private static void valueOf__1766510968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766510968L))
            info.setReturnValue(net.minecraft.world.level.levelgen.DensityFunctions.TwoArgumentSimpleFunction.Type.MUL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1929012999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929012999L))
            info.setReturnValue("N[w'`}T47\u83DFU^!f6q2\u9A35KiG}SP>bw[XgOT\u7C0CeR`eC\u1BDF\uFA34*W<y\u0BCC'+a_03}:PztD=N\u2B1Fvh}k<a&!OXGocY");
    }


}
