package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.class)
public class Type_1337041860Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private static void values__1434172664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434172664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private static void valueOf__1585893855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585893855L))
            info.setReturnValue(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.PORTAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1425250481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425250481L))
            info.setReturnValue("7Y^BP3L!\u3D25Y\uAC0FM\u28D5q#]u\uAC45E-P$*Z:r)0}Zs\uC746-f\u1167\u4A19n");
    }


}
